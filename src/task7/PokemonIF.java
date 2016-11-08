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

interface PokemonIF {
    int getLevel();
    List<Move> getMoveList();
    Move getMoveOne();
    Move getMoveTwo();
    Move getMoveThree();
    Move getMoveFour();
    void evolve();
    void setEvolution(EvolutionIF e);
}
