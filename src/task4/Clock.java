package task4;

import java.util.Scanner;

/**
 * muas-tx00cf83-3002
 *
 * @author diftraku
 * @package muas-tx00cf83-3002
 * @copyright Copyright (c) 2016, Diftraku
 * @license https://opensource.org/licenses/MIT The MIT License (MIT)
 */

public class Clock {
    public static void main(String[] args) {
        Timer timer = new Timer();
        ClockFace clock = new ClockFace();
        Scanner input = new Scanner(System.in);
        timer.addObserver(clock);

        while(true) {
            input.nextLine();
            timer.run();
        }
    }
}
