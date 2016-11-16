package task11;

import java.util.ArrayList;
import java.util.Random;

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
        /*Riddler riddler = Riddler.getInstance();
        Client client = new Client();
        riddler.joinGame(client);
        System.out.print(riddler.guess(client, 1));*/
        ArrayList<Client> clients = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            clients.add(new Client());
        }

        clients.forEach(Client::run);
    }
}
