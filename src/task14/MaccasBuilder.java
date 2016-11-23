package task14;

import java.util.ArrayList;

/**
 * muas-tx00cf83-3002
 *
 * @author diftraku
 * @package muas-tx00cf83-3002
 * @copyright Copyright (c) 2016, Diftraku
 * @license https://opensource.org/licenses/MIT The MIT License (MIT)
 */

public class MaccasBuilder extends BurgerBuilder {
    private ArrayList<String> burger;

    @Override
    public String getBurger() {
        String brgr = "";
        for (String topping :
                burger) {
            brgr += topping+" ";
        }
        return brgr;

    }

    @Override
    public void createNewBurger() {
        burger = new ArrayList<>();
    }

    @Override
    public void addPatty() {
        burger.add("piffi");
    }

    @Override
    public void addBun() {
        burger.add("leipä");
    }

    @Override
    public void addLettuce() {
        burger.add("kaninruokaa");
    }

    @Override
    public void addMajonnaise() {
        burger.add("möhnää");
    }

    @Override
    public void addCheese() {
        burger.add("sissijuusto");
    }

    @Override
    public void addOnion() {
        burger.add("sibale");
    }
}
