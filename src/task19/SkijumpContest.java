package task19;

import java.util.ArrayList;
import java.util.StringJoiner;

/**
 * muas-tx00cf83-3002
 *
 * @author diftraku
 * @package muas-tx00cf83-3002
 * @copyright Copyright (c) 2016, Diftraku
 * @license https://opensource.org/licenses/MIT The MIT License (MIT)
 */

public class SkijumpContest implements Mediator {
    final static double JUMP_RANGE_MIN = 100.0;
    final static double JUMP_RANGE_MAX = 225.0;
    final static int JUMP_TRIES = 2;
    final static int JUDGE_COUNT = 5;
    private ArrayList<ContestEntity> listeners = new ArrayList<>();

    @Override
    public void sendEvent(ContestEntity sender, String message) {
        for (ContestEntity listener :
                listeners) {
            listener.receive(message);
        }

    }

    @Override
    public void addListener(ContestEntity reference) {
        // Add new subscriber
        listeners.add(reference);
    }

    public static void main(String[] args) {
        Mediator mediator = new SkijumpContest();
        Jumper jumper = new Jumper();
    }
}
