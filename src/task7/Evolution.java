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
    protected int evolvesAt;
    protected EvolutionIF nextStage;

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

    public int getEvolvesAt() {
        return evolvesAt;
    }

    protected void setEvolution(Pokemon p, Evolution e) {
        p.setEvolution(e);
    }

    @Override
    public void evolve(Pokemon p) {
        if (p.getLevel() >= evolvesAt && !(nextStage == null)) {
            p.setEvolution(nextStage);
        }
    }
}
