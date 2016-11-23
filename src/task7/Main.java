package task7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Random;

/**
 * muas-tx00cf83-3002
 *
 * @author diftraku
 * @package muas-tx00cf83-3002
 * @copyright Copyright (c) 2016, Diftraku
 * @license https://opensource.org/licenses/MIT The MIT License (MIT)
 */

@SuppressWarnings("Duplicates")
public class Main {
    static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon();
        while (true) {
            Main.printMenu(pokemon);
            switch (Main.readInt()) {
                case 1:
                    Main.printTrainingMenu(pokemon);
                    break;
                case 2:
                    int toNextLevel = pokemon.getEvolvesAt() - pokemon.getLevel();
                    if (pokemon.getEvolvesAt() != -1 && toNextLevel <= 0) {
                        System.out.println("Evolving " + pokemon + "\n");
                        pokemon.evolve();
                        System.out.print("Got ");
                        Main.printStatus(pokemon);
                    } else {
                        if (pokemon.getEvolvesAt() != -1 && toNextLevel > 0) {
                            System.out.println(toNextLevel + " levels until next evolution, try training a bit more");
                        } else {
                            System.out.println("Last evolution, cannot evolve further normally");
                        }
                    }
                    break;
                case 3:
                    Main.printStatus(pokemon);
                    break;
                case 4:
                    System.exit(0);
                    break;
                case 9:
                    pokemon.setLevel(pokemon.getLevel() + 10);
                    break;
            }
        }
    }

    private static void printStatus(Pokemon p) {
        int toNextLevel = p.getEvolvesAt() - p.getLevel();
        System.out.println(p);
        if (toNextLevel > 0) {
            System.out.println(toNextLevel + " levels until next evolution");
        } else if (p.getEvolvesAt() != -1 && toNextLevel <= 0) {
            System.out.println("Next evolution available");
        }
        Main.printMoveList(p);
        System.out.print("\n");
    }

    private static void printTrainingMenu(Pokemon p) {
        boolean training = true;
        Random rand = new Random();
        Move move = new Move("", 0, 0);
        int dummyHP = 30 + (rand.nextInt(20) * 10);
        int xp = 0;
        while (training) {
            System.out.println("[Training] " + p);
            System.out.println((p.getEvolvesAt() - p.getLevel()) + " levels until next evolution");
            System.out.println("Dummy has " + dummyHP + " HP");
            System.out.println("Available moves:");
            Main.printMoveList(p);
            System.out.print("[5] Exit training\n");
            switch (Main.readInt()) {
                case 1:
                    move = p.getMoveOne();
                    break;
                case 2:
                    move = p.getMoveTwo();
                    break;
                case 3:
                    move = p.getMoveThree();
                    break;
                case 4:
                    move = p.getMoveFour();
                    break;
                case 5:
                    training = false;
            }
            if (training) {
                System.out.println("Using " + move.getName() + " against training dummy.");
                dummyHP -= move.getDamage();
                System.out.println("Dummy takes " + move.getDamage() + " points of " + move.getTypeString() + " damage.");
                if (dummyHP <= 0) {
                    System.out.println("The training dummy breaks!");
                    xp = (rand.nextInt(9)+1);
                    p.addXP(xp);
                    System.out.println("Got "+xp+" levels");
                    training = false;
                }
            }

        }
    }

    private static void printMenu(Pokemon pokemon) {
        StringBuilder out = new StringBuilder();
        out.append("Pokemon Sim\n\n");
        out.append("Available actions:\n");
        out.append("[1] Training\n");
        out.append("[2] Evolve\n");
        out.append("[3] Status\n");
        out.append("[4] Exit\n");
        System.out.print(out.toString());
    }

    private static void printMoveList(Pokemon pokemon) {
        StringBuilder out = new StringBuilder();
        List<Move> moveList = pokemon.getMoveList();
        int i = 1;
        for (Move move : moveList) {
            out.append("[").append(i).append("] ").append(move).append("\n");
            i++;
        }
        System.out.print(out.toString());
    }

    private static String readLine() {
        String line;
        do {
            try {
                line = stdin.readLine();
                break;
            } catch (Exception e) {
                System.err.println(e);
            }
        } while (true);
        return line;
    }

    private static int readInt() {
        int number;
        do {
            try {
                number = Integer.parseInt(stdin.readLine());
                break;
            } catch (Exception e) {
                System.err.println(e);
            }
        } while (true);
        return number;
    }
}
