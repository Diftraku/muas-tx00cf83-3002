package task13;

/**
 * muas-tx00cf83-3002
 *
 * @author diftraku
 * @package muas-tx00cf83-3002
 * @copyright Copyright (c) 2016, Diftraku
 * @license https://opensource.org/licenses/MIT The MIT License (MIT)
 */

public class State2 implements StateIF {
    private static State2 instance = new State2();
    @Override
    public void accept(VisitorIF visitor) {
        visitor.visit(this);
    }

    public static State2 getInstance() {
        return instance;
    }
}
