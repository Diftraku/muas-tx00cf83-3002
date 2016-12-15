package task18;

/**
 * muas-tx00cf83-3002
 *
 * @author diftraku
 * @package muas-tx00cf83-3002
 * @copyright Copyright (c) 2016, Diftraku
 * @license https://opensource.org/licenses/MIT The MIT License (MIT)
 */

public class Clock implements Cloneable {
    protected ClockHand hours;
    protected ClockHand minutes;

    public Clock(int hours, int minutes) {
        this.hours = new ClockHand("hour", hours);
        this.minutes = new ClockHand("minute", minutes);
    }

    public void setTime(int hours, int minutes) {
        this.hours.setPosition(hours);
        this.minutes.setPosition(minutes);
    }

    @Override
    public String toString() {
        return "Clock{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                '}';
    }

    @Override
    public Clock clone() {
        Clock c = null;
        try {
            c = (Clock) super.clone();
            c.hours = (ClockHand) hours.clone();
            c.minutes = (ClockHand) minutes.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return c;
    }
}
