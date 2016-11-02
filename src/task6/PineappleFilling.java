package task6;

/**
 * muas-tx00cf83-3002
 *
 * @author diftraku
 * @package muas-tx00cf83-3002
 * @copyright Copyright (c) 2016, Diftraku
 * @license https://opensource.org/licenses/MIT The MIT License (MIT)
 */

public class PineappleFilling extends PizzaDecorator {
    public PineappleFilling(PizzaIF filling) {
        super(filling);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Ananas";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1.39;
    }
}
