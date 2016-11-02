package task4;

import java.time.LocalDateTime;
import java.util.Observable;

/**
 * muas-tx00cf83-3002
 *
 * @author diftraku
 * @package muas-tx00cf83-3002
 * @copyright Copyright (c) 2016, Diftraku
 * @license https://opensource.org/licenses/MIT The MIT License (MIT)
 */

class Timer extends Observable {
    private LocalDateTime time;

    Timer() {
        this.time = LocalDateTime.now();
    }

    void run() {
        setChanged();
        notifyObservers(time.now());
    }
}
