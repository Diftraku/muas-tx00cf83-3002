package task6;

import java.util.ArrayList;

/**
 * muas-tx00cf83-3002
 *
 * @author diftraku
 * @package muas-tx00cf83-3002
 * @copyright Copyright (c) 2016, Diftraku
 * @license https://opensource.org/licenses/MIT The MIT License (MIT)
 */

public class Pizzeria {
    public static void main(String[] args) {
        ArrayList<PizzaIF> hinnasto = new ArrayList<>();
        hinnasto.add(new PineappleFilling(new ChickenFilling(new PizzaBase(new Pizza()))));
        hinnasto.add(new HamFilling(new PizzaBase(new Pizza())));
        hinnasto.add(new HamFilling(new PineappleFilling(new ChickenFilling(new PizzaBase(new Pizza())))));
        for (PizzaIF pizza :
                hinnasto) {
            System.out.println(pizza.getDescription()+" "+pizza.getPrice()+"€");
        }
    }
}
