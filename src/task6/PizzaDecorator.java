package task6;

/**
 * muas-tx00cf83-3002
 *
 * @author diftraku
 * @package muas-tx00cf83-3002
 * @copyright Copyright (c) 2016, Diftraku
 * @license https://opensource.org/licenses/MIT The MIT License (MIT)
 */

abstract public class PizzaDecorator implements PizzaIF {
    protected PizzaIF filling;

    public PizzaDecorator(PizzaIF filling) {
        this.filling = filling;
    }

    @Override
    public String getDescription() {
        return filling.getDescription();
    }

    @Override
    public double getPrice() {
        return filling.getPrice();
    }

    @Override
    public String toString() {
        return "PizzaDecorator{" +
                "description=" + filling.getDescription() +
                "price=" + filling.getPrice() +
                '}';
    }
}
