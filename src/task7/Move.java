package task7;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * muas-tx00cf83-3002
 *
 * @author diftraku
 * @package muas-tx00cf83-3002
 * @copyright Copyright (c) 2016, Diftraku
 * @license https://opensource.org/licenses/MIT The MIT License (MIT)
 */

@SuppressWarnings("Duplicates")
public class Move {
    public static final int TYPE_NORMAL = 1;
    public static final int TYPE_FIGHTING = 2;
    public static final int TYPE_FLYING = 3;
    public static final int TYPE_POISON = 4;
    public static final int TYPE_GROUND = 5;
    public static final int TYPE_ROCK = 6;
    public static final int TYPE_BUG = 7;
    public static final int TYPE_GHOST = 8;
    public static final int TYPE_STEEL = 9;
    public static final int TYPE_FIRE = 10;
    public static final int TYPE_WATER = 11;
    public static final int TYPE_GRASS = 12;
    public static final int TYPE_ELECTRIC = 13;
    public static final int TYPE_PSYCHIC = 14;
    public static final int TYPE_ICE = 15;
    public static final int TYPE_DRAGON = 16;
    public static final int TYPE_DARK = 17;
    public static final int TYPE_FAIRY = 18;
    public static final int TYPE_UNKNOWN = 10001;
    public static final int TYPE_SHADOW = 10002;
    private static final Map<Integer, String> moveStrings;

    static {
        Map<Integer, String> tmpMap = new HashMap<>();
        tmpMap.put(1, "normal");
        tmpMap.put(2, "fighting");
        tmpMap.put(3, "flying");
        tmpMap.put(4, "poison");
        tmpMap.put(5, "ground");
        tmpMap.put(6, "rock");
        tmpMap.put(7, "bug");
        tmpMap.put(8, "ghost");
        tmpMap.put(9, "steel");
        tmpMap.put(10, "fire");
        tmpMap.put(11, "water");
        tmpMap.put(12, "grass");
        tmpMap.put(13, "electric");
        tmpMap.put(14, "psychic");
        tmpMap.put(15, "ice");
        tmpMap.put(16, "dragon");
        tmpMap.put(17, "dark");
        tmpMap.put(18, "fairy");
        tmpMap.put(10001, "unknown");
        tmpMap.put(10002, "shadow");
        moveStrings = Collections.unmodifiableMap(tmpMap);
    }

    private String name = "None";
    private int damage = 0;
    private int type = 0;

    public Move(String name, int damage, int type) {
        this.name = name;
        this.damage = damage;
        this.type = type;
    }

    public String getTypeString() {
        return Move.moveStrings.get(this.type);
    }

    public String getNormalizedTypeString() {
        return this.getTypeString().substring(0, 1).toUpperCase() + this.getTypeString().substring(1);
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getType() {
        return type;
    }

    @Override
    public String toString() {
        return name+" ("+damage+" dmg, "+getNormalizedTypeString()+")";
    }
}
