package task18;

/**
 * muas-tx00cf83-3002
 *
 * @author diftraku
 * @package muas-tx00cf83-3002
 * @copyright Copyright (c) 2016, Diftraku
 * @license https://opensource.org/licenses/MIT The MIT License (MIT)
 */

public class ClockHand implements Cloneable {
    private String type;
    private int position;

    public ClockHand(String type, int position) {
        this.type = type;
        this.position = position;
    }

    @Override
    public String toString() {
        return "I'm a(n) " + type + "hand and I read " + String.format("%02d", position);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
