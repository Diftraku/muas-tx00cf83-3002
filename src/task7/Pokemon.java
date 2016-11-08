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

public class Pokemon implements PokemonIF {
    EvolutionIF state;
    private int level = 1;

    public Pokemon() {
        state = Charmander.getInstance();
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public List<Move> getMoveList() {
        return state.getMoveList(this);
    }

    public Move getMoveOne() {
        return state.getMoveOne(this);
    }

    public Move getMoveTwo() {
        return state.getMoveTwo(this);
    }

    public Move getMoveThree() {
        return state.getMoveThree(this);
    }

    public Move getMoveFour() {
        return state.getMoveFour(this);
    }

    @Override
    public void evolve() {
        this.state.evolve(this);
    }

    public void setEvolution(EvolutionIF e) {
        this.state = e;
    }

    @Override
    public String toString() {
        return state.getClass().getSimpleName()+", level "+this.getLevel();
    }

    public int getEvolvesAt() {
        return state.getEvolvesAt();
    }

    public void addXP(int xp) {
        this.level += xp;
    }
}
