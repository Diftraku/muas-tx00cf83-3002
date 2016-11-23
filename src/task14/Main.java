package task14;

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
        BurgurWaiter waiter = new BurgurWaiter();
        waiter.setBurgerBuilder(new MaccasBuilder());
        waiter.makeBurger();
        System.out.println("Maccas: "+waiter.getBurger());
        waiter.setBurgerBuilder(new HeseburgurBuilder());
        waiter.makeBurger();
        System.out.println("Hese: "+waiter.getBurger());

    }

    public static class BurgurWaiter {
        private BurgerBuilder brgrbldr;

        public void setBurgerBuilder(BurgerBuilder brgrb) {
            this.brgrbldr = brgrb;
        }

        public String getBurger() {
            return brgrbldr.getBurger();
        }

        public void makeBurger() {
            brgrbldr.createNewBurger();
            brgrbldr.addBun();
            brgrbldr.addMajonnaise();
            brgrbldr.addPatty();
            brgrbldr.addCheese();
            brgrbldr.addLettuce();
            brgrbldr.addBun();
            brgrbldr.addMajonnaise();
            brgrbldr.addCheese();
            brgrbldr.addPatty();
            brgrbldr.addCheese();
            brgrbldr.addOnion();
            brgrbldr.addBun();
        }
    }
}
