package task19;

import static task19.SkijumpContest.JUMP_TRIES;

/**
 * muas-tx00cf83-3002
 *
 * @author diftraku
 * @package muas-tx00cf83-3002
 * @copyright Copyright (c) 2016, Diftraku
 * @license https://opensource.org/licenses/MIT The MIT License (MIT)
 */

public class Jumper extends ContestEntity {
    private int attempts = 0;

    public Jumper(Mediator mediator) {
        super(mediator);
    }

    public void send(String msg) {
        mediator.sendEvent(this, msg);
    }

    @Override
    public void receive(String msg) {
        int attempt;
        if (msg.equals("jump.ready")) {
            if (attempts < JUMP_TRIES) {
                attempts++;
                attempt = attempts;
                this.send(String.format("jump.start=%d", attempt));
            }
        }
        else if (msg.contains("jump.start")) {
            attempt = Integer.parseInt(msg.substring(msg.indexOf("=")));
            this.send(String.format("jump.start=%d", attempt));
        }
    }
}
