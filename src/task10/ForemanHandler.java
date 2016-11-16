package task10;

/**
 * muas-tx00cf83-3002
 *
 * @author diftraku
 * @package muas-tx00cf83-3002
 * @copyright Copyright (c) 2016, Diftraku
 * @license https://opensource.org/licenses/MIT The MIT License (MIT)
 */

public class ForemanHandler extends Handler {
    public ForemanHandler(Handler successor) {
        super(successor);
    }

    @Override
    public void handle(WageRaiseRequest request) {
        if (request.getIncreasePercentage() <= 2.00) {
            System.out.printf("%s says you can has money! %.2f\n", this.getClass().getSimpleName().replace("Handler", ""), request.getNewWage());
        }
        else  {
            super.handle(request);
        }
    }
}
