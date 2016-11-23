package task13;

/**
 * muas-tx00cf83-3002
 *
 * @author diftraku
 * @package muas-tx00cf83-3002
 * @copyright Copyright (c) 2016, Diftraku
 * @license https://opensource.org/licenses/MIT The MIT License (MIT)
 */

public abstract class AbstractContext implements ContextIF {
    protected StateIF state = new State1();
    protected int xp = 0;

    public void setState(StateIF newState) {
        this.state = newState;
    }

    public void accept(VisitorIF visitor) {
        this.state.accept(visitor);
    }
}
