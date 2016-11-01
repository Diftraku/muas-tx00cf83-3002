package task4;

import java.time.LocalDate;
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

public class Timer extends Observable {
    private LocalDateTime time;

    public Timer() {
        this.time = LocalDateTime.now();
    }

    public void run() {
        this.time = time.now();
        setChanged();
        notifyObservers(time);
    }
}
