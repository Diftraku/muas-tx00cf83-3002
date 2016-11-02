package task6;

/**
 * muas-tx00cf83-3002
 *
 * @author diftraku
 * @package muas-tx00cf83-3002
 * @copyright Copyright (c) 2016, Diftraku
 * @license https://opensource.org/licenses/MIT The MIT License (MIT)
 */

public class ChickenFilling extends PizzaDecorator{
    public ChickenFilling(PizzaIF filling) {
        super(filling);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Kana";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1.49;
    }
}
