package task18;

/**
 * muas-tx00cf83-3002
 *
 * @author diftraku
 * @package muas-tx00cf83-3002
 * @copyright Copyright (c) 2016, Diftraku
 * @license https://opensource.org/licenses/MIT The MIT License (MIT)
 */

public class ClockMain {
    public static void main(String[] args) {
        Clock clock = new Clock(12, 0);
        Clock clockClone = clock.clone();

        System.out.println("Set original clock to 15:00");
        clock.setTime(15, 0); // Koodi 3

        System.out.println("Set original clock to 00:00");
        clockClone.setTime(0, 0);

        System.out.println("Original: "+clock);
        System.out.println("Deep Clone: "+clockClone);
    }
}
