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

abstract public class Evolution implements EvolutionIF {
    protected List<Move> moveList;


    @Override
    public List<Move> getMoveList(Pokemon p) {
        return this.moveList;
    }

    @Override
    public Move getMoveOne(Pokemon p) {
        return this.moveList.get(0);
    }

    @Override
    public Move getMoveTwo(Pokemon p) {
        return this.moveList.get(1);
    }

    @Override
    public Move getMoveThree(Pokemon p) {
        return this.moveList.get(2);
    }

    @Override
    public Move getMoveFour(Pokemon p) {
        return this.moveList.get(3);
    }

    protected void setEvolution(Pokemon p, Evolution e) {
        p.setEvolution(e);
    }
}
