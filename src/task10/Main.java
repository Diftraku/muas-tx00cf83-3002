package task10;

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
        Handler handler = new ForemanHandler(new ChiefHandler(new CEOHandler(null)));
        WageRaiseRequest twopcntincreaste = new WageRaiseRequest(1200.00, 1224.00);
        WageRaiseRequest fivepcntincrease = new WageRaiseRequest(1200.00, 1260.00);
        WageRaiseRequest smallloanofmilliondollars = new WageRaiseRequest(0, 1000000.00);
        handler.handle(twopcntincreaste);
        handler.handle(fivepcntincrease);
        handler.handle(smallloanofmilliondollars);
    }
}
