package task4;

import java.util.Observable;
import java.util.Observer;

/**
 * muas-tx00cf83-3002
 *
 * @author diftraku
 * @package muas-tx00cf83-3002
 * @copyright Copyright (c) 2016, Diftraku
 * @license https://opensource.org/licenses/MIT The MIT License (MIT)
 */

class ClockFace implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.printf("%s%n", arg);
    }
}
