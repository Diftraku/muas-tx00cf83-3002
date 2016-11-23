package task15;

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
        JokuRajapinta jokuKilke = new JokuKilke();
        jokuKilke.fizz();
        jokuKilke.buzz();
        JokuToinenRajapinta jokuToinenKilke = new JokuToinenKilke();
        jokuToinenKilke.fizzbuzz();
        jokuToinenKilke.buzzfizz();

        JokuDummyLuokka jokuDummyLuokka = new JokuDummyLuokka(new JokuAdapter(jokuKilke));
        jokuDummyLuokka.bar();
        jokuDummyLuokka.foo();
        jokuDummyLuokka = new JokuDummyLuokka(new JokuToinenAdapter(jokuToinenKilke));
        jokuDummyLuokka.bar();
        jokuDummyLuokka.foo();


    }


    private static class JokuDummyLuokka {
        JokuAdapterRajapinta jokuKilke;

        public JokuDummyLuokka(JokuAdapterRajapinta jokuKilke) {
            this.jokuKilke = jokuKilke;
        }

        public void foo() {
            jokuKilke.foo();
        }

        public void bar() {
            jokuKilke.bar();
        }
    }
}
