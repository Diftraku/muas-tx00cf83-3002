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

public class KSP extends Game {
    private String[] possiblePlays = {"kivi", "sakset", "paperi"};
    private String[] plays;
    private int playCount = 0;
    private Random rand;

    @Override
    void initializeGame() {
        rand = new Random();
        plays = new String[playersCount];
    }

    @Override
    void makePlay(int player) {
        plays[player] = possiblePlays[rand.nextInt(possiblePlays.length)];
        playCount += 1;
    }

    @Override
    boolean endOfGame() {
        return playCount == playersCount;
    }

    @Override
    void printWinner() {
        System.out.println("A winnar is joo!");
        int i = 0;
        for (String play : plays) {
            System.out.printf("Player %d: %s\n", (i+1), play);
            i += 1;
        }
    }
}
