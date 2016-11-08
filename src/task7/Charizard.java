package task7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * muas-tx00cf83-3002
 *
 * @author diftraku
 * @package muas-tx00cf83-3002
 * @copyright Copyright (c) 2016, Diftraku
 * @license https://opensource.org/licenses/MIT The MIT License (MIT)
 */

public class Charizard  extends Evolution {
    private static EvolutionIF instance = new Charizard();
    public int getEvolvesAt() {
        return -1;
    }

    private Charizard() {
        ArrayList<Move> tmpList = new ArrayList<>();
        tmpList.add(new Move("Flamethrower", 90, Move.TYPE_FIRE));
        tmpList.add(new Move("Dragon Rage", 40, Move.TYPE_DRAGON));
        tmpList.add(new Move("Inferno", 100, Move.TYPE_FIRE));
        tmpList.add(new Move("Flame Burst", 70, Move.TYPE_FIRE));
        moveList = Collections.unmodifiableList(tmpList);
    }

    @Override
    public void evolve(Pokemon p) {
        // Do nothing
    }


    public static EvolutionIF getInstance() {
        return instance;
    }
}
