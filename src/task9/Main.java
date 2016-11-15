package task9;

import java.math.BigInteger;
import java.util.ArrayList;
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

public class Main {
    public static void main(String[] args) {
        ListConverter lc1, lc2, lc3;
        Random rand = new Random();
        lc1 = new ListConverter(new EveryLineStrategy());
        lc2 = new ListConverter(new EveryOtherLineStrategy());
        lc3 = new ListConverter(new EveryThirdLineStrategy());

        System.out.println("Preparing sample data");
        List<String> sample = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            sample.add( "|"+(new BigInteger(130, rand).toString(32))+"|" );
        }
        lc1.setList(sample);
        lc2.setList(sample);
        lc3.setList(sample);
        System.out.println("Dumping strings...\n\n");

        System.out.println("Every line:");
        lc1.printList();
        System.out.println("\nEvery other line:");
        lc2.printList();
        System.out.println("\nEvery third line:");
        lc3.printList();
    }
}
