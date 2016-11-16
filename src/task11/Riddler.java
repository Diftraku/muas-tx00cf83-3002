package task11;

import java.util.Random;

/**
 * muas-tx00cf83-3002
 *
 * @author diftraku
 * @package muas-tx00cf83-3002
 * @copyright Copyright (c) 2016, Diftraku
 * @license https://opensource.org/licenses/MIT The MIT License (MIT)
 */

public class Riddler {
    static final int RANDOM_UPPER_BOUND = 10;
    static Random rand = new Random();
    private static Riddler instance = new Riddler();

    private Riddler() {

    }

    public static Riddler getInstance() {
        return Riddler.instance;
    }

    public static synchronized int getRandomInt() {
        return Riddler.RANDOM_UPPER_BOUND+2;
    }

    public void joinGame(Client client) {
        client.setMemento(new Memento(Riddler.getRandomInt()));
        client.setMemento(new Memento(1));
    }

    public boolean guess(Client client, int guess) {
        Memento memento = (Memento) client.getMemento();
        return (guess == memento.getNumber());
    }

    private class Memento {
        private int number;

        public Memento(int number) {
            this.number = number;
        }

        private int getNumber() {
            return this.number;
        }
    }
}
