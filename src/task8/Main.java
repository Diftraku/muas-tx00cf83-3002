package task8;

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
        Game game = new KSP();
        Random rand = new Random();
        // Randomize amount of  players
        int playersCount = rand.nextInt(3) + 2;
        game.initializeGame();
        game.playOneGame(playersCount);
    }
}
