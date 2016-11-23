package task13;

/**
 * muas-tx00cf83-3002
 *
 * @author diftraku
 * @package muas-tx00cf83-3002
 * @copyright Copyright (c) 2016, Diftraku
 * @license https://opensource.org/licenses/MIT The MIT License (MIT)
 */

public class Main {
    public static void main(String[] args) {
        Context ctx = new Context();
        Visitor v = new Visitor();
        ctx.accept(v);
        ctx.setState(State2.getInstance());
        ctx.accept(v);
        ctx.setState(State3.getInstance());
        ctx.accept(v);
        ctx.setState(State1.getInstance());
        ctx.accept(v);


    }
}
