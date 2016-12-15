package task19;

import java.util.ArrayList;

import static task19.SkijumpContest.JUDGE_COUNT;
import static task19.SkijumpContest.JUMP_TRIES;

/**
 * muas-tx00cf83-3002
 *
 * @author diftraku
 * @package muas-tx00cf83-3002
 * @copyright Copyright (c) 2016, Diftraku
 * @license https://opensource.org/licenses/MIT The MIT License (MIT)
 */

public class Jump extends ContestEntity {
    private int attempt = 0;
    private double distance = 0.00;
    private ArrayList<Double> scores = new ArrayList<>(JUDGE_COUNT);

    public Jump(Mediator mediator, int attempt) {
        super(mediator);
        this.attempt = attempt;
    }

    @Override
    public void send(String msg) {
        mediator.sendEvent(this, msg);
    }

    @Override
    public void receive(String msg) {
        if (msg.contains("jump.distance"+attempt)) {
            if (Double.compare(this.distance, 0.00) == 0) {
                this.distance = Double.parseDouble(msg.substring(msg.indexOf("=")));
            }
        } else if (msg.contains("jump.score"+attempt)) {
            double score = Double.parseDouble(msg.substring(msg.indexOf("=")));
            if (scores.size() < JUDGE_COUNT) {
                scores.add(score);
            }
        }
    }
}
