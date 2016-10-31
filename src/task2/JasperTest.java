package task2;

import task2.Factories.Jasper;
import task2.Factories.JasperBossFactory;
import task2.Factories.JasperSlaaviFactory;

/**
 * muas-tx00cf83-3002
 *
 * @author diftraku
 * @package muas-tx00cf83-3002
 * @copyright Copyright (c) 2016, Diftraku
 * @license https://opensource.org/licenses/MIT The MIT License (MIT)
 */

public class JasperTest {
    public static void main(String[] args) {
        Jasper boss = new JasperBossFactory();
        Jasper slaavi = new JasperSlaaviFactory();
        System.out.println(boss);
        System.out.println(slaavi);

    }
}
