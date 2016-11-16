package task11;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * muas-tx00cf83-3002
 *
 * @author diftraku
 * @package muas-tx00cf83-3002
 * @copyright Copyright (c) 2016, Diftraku
 * @license https://opensource.org/licenses/MIT The MIT License (MIT)
 */

public class Main {
    public static CyclicBarrier gate;
    public static void main(String[] args) {
        /*Riddler riddler = Riddler.getInstance();
        Client client = new Client();
        riddler.joinGame(client);
        System.out.print(riddler.guess(client, 1));*/
        ArrayList<Client> clients = new ArrayList<>();
        Main.gate = new CyclicBarrier(20);
        for (int i = 0; i < 20; i++) {
            clients.add(new Client());
        }

        clients.forEach(Client::start);

        try {
            Main.gate.await();
            System.out.println("Started all threads!");
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
