package task11;

import java.util.concurrent.BrokenBarrierException;

/**
 * muas-tx00cf83-3002
 *
 * @author diftraku
 * @package muas-tx00cf83-3002
 * @copyright Copyright (c) 2016, Diftraku
 * @license https://opensource.org/licenses/MIT The MIT License (MIT)
 */

public class Client extends Thread {
    private Object memento;

    @Override
    public void run() {
        Riddler riddler = Riddler.getInstance();
        riddler.joinGame(this);
        try {
            Main.gate.await();
            while (true) {
                int guess = Riddler.rand.nextInt(Riddler.getRandomInt());
                boolean result = riddler.guess(this, guess);
                System.out.printf("%s guessed %s (%d)\n", this.hashCode(), (result ? "correctly" : "incorrectly"), guess);
                if (result) {
                    break;
                }
                Thread.sleep(150);
            }
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }

    public Object getMemento() {
        return memento;
    }

    public void setMemento(Object memento) {
        this.memento = memento;
    }
}
