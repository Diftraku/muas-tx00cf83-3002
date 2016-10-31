package task2.Factories;

import task2.Clothing.Boss.BossHat;
import task2.Clothing.Boss.BossPants;
import task2.Clothing.Boss.BossShirt;
import task2.Clothing.Boss.BossShoes;

/**
 * muas-tx00cf83-3002
 *
 * @author diftraku
 * @package muas-tx00cf83-3002
 * @copyright Copyright (c) 2016, Diftraku
 * @license https://opensource.org/licenses/MIT The MIT License (MIT)
 */

public class JasperBossFactory extends Jasper {
    @Override
    public Jasper setJasper() {
        this.hat = new BossHat();
        this.shirt = new BossShirt();
        this.pants = new BossPants();
        this.shoes = new BossShoes();
        return this;
    }
}
