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

public class Charmander extends Evolution {
    private static EvolutionIF instance = new Charmander();
    private final int evolvesAt = 16;

    private Charmander() {
        ArrayList<Move> tmpList = new ArrayList<>();
        tmpList.add(new Move("Scratch", 40, Move.TYPE_NORMAL));
        tmpList.add(new Move("Growl", 0, Move.TYPE_NORMAL));
        tmpList.add(new Move("Ember", 40, Move.TYPE_FIRE));
        tmpList.add(new Move("Leer", 0, Move.TYPE_NORMAL));
        this.moveList = Collections.unmodifiableList(tmpList);
    }

    @Override
    public void evolve(Pokemon p) {
        if (p.getLevel() >= evolvesAt) {
            p.setEvolution(Charmeleon.getInstance());
        }
    }

    public int getEvolvesAt() {
        return evolvesAt;
    }

    public static EvolutionIF getInstance() {
        return instance;
    }
}
