package task14;

/**
 * muas-tx00cf83-3002
 *
 * @author diftraku
 * @package muas-tx00cf83-3002
 * @copyright Copyright (c) 2016, Diftraku
 * @license https://opensource.org/licenses/MIT The MIT License (MIT)
 */

public class HeseburgurBuilder extends BurgerBuilder {
    private StringBuilder burger;
    @Override
    public String getBurger() {
        return new String(burger);
    }

    @Override
    public void createNewBurger() {
        burger = new StringBuilder();
    }

    @Override
    public void addPatty() {
        burger.append("pihvee");
    }

    @Override
    public void addBun() {
        burger.append("leepä");
    }

    @Override
    public void addLettuce() {
        burger.append("virheetä");
    }

    @Override
    public void addMajonnaise() {
        burger.append("valkosta");
    }

    @Override
    public void addCheese() {
        burger.append("jjuusto");
    }

    @Override
    public void addOnion() {
        burger.append("sibali");
    }
}
