package task7;

import java.util.List;

/**
 * muas-tx00cf83-3002
 *
 * @author diftraku
 * @package muas-tx00cf83-3002
 * @copyright Copyright (c) 2016, Diftraku
 * @license https://opensource.org/licenses/MIT The MIT License (MIT)
 */

public interface EvolutionIF {
    List<Move> getMoveList(Pokemon p);
    Move getMoveOne(Pokemon p);
    Move getMoveTwo(Pokemon p);
    Move getMoveThree(Pokemon p);
    Move getMoveFour(Pokemon p);
    void evolve(Pokemon p);
    int getEvolvesAt();

    static EvolutionIF getInstance() {
        return null;
    }
}
