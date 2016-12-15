package task19;

import java.util.Random;

import static task19.SkijumpContest.JUMP_RANGE_MAX;
import static task19.SkijumpContest.JUMP_RANGE_MIN;

/**
 * muas-tx00cf83-3002
 *
 * @author diftraku
 * @package muas-tx00cf83-3002
 * @copyright Copyright (c) 2016, Diftraku
 * @license https://opensource.org/licenses/MIT The MIT License (MIT)
 */

public class Measurer extends ContestEntity {
    public Measurer(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String msg) {
        mediator.sendEvent(this, msg);
    }

    @Override
    public void receive(String msg) {
        if (msg.contains("jump.end")) {
            int attempt = Integer.parseInt(msg.substring(msg.indexOf("=")));
            // Generate a random jump
            Random random = new Random();
            double distance = JUMP_RANGE_MIN + (JUMP_RANGE_MAX - JUMP_RANGE_MIN) * random.nextDouble();
            this.send(String.format("jump.attempt=%d;distance=%f", attempt, distance));
        }
    }
}
