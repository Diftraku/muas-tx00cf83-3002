package task13;

/**
 * muas-tx00cf83-3002
 *
 * @author diftraku
 * @package muas-tx00cf83-3002
 * @copyright Copyright (c) 2016, Diftraku
 * @license https://opensource.org/licenses/MIT The MIT License (MIT)
 */

public class Visitor extends AbstractVisitor {
    @Override
    public void visit(State1 state) {
        System.out.println("Adding bonus points to state 1");
    }

    @Override
    public void visit(State2 state) {
        System.out.println("Adding bonus points to state 2");
    }

    @Override
    public void visit(State3 state) {
        System.out.println("Adding bonus points to state 3");
    }
}
