package task19;

import java.util.Random;

import static task19.SkijumpContest.JUDGE_COUNT;

/**
 * muas-tx00cf83-3002
 *
 * @author diftraku
 * @package muas-tx00cf83-3002
 * @copyright Copyright (c) 2016, Diftraku
 * @license https://opensource.org/licenses/MIT The MIT License (MIT)
 */

public class Judge extends ContestEntity {
    //private static int judgeCount = 0;
    //private int judgeNumber;
    public Judge(Mediator mediator) {
        super(mediator);
        /*if (judgeCount < JUDGE_COUNT) {
            judgeCount++;
            judgeNumber = judgeCount;
        }*/
    }

    @Override
    public void send(String msg) {
        this.mediator.sendEvent(this, msg);
    }

    @Override
    public void receive(String msg) {
        if (msg.contains("jump.end")) {
            int attempt = Integer.parseInt(msg.substring(msg.indexOf("=")));
            // generate score
            Random random = new Random();
            double score = 10 * random.nextDouble();
            this.send(String.format("jump.attempt=%d;score=%f", attempt, score));
        }
    }
}
