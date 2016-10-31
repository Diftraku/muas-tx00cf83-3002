package task2.Factories;

import task2.Clothing.Slaavi.SlaaviHat;
import task2.Clothing.Slaavi.SlaaviPants;
import task2.Clothing.Slaavi.SlaaviShirt;
import task2.Clothing.Slaavi.SlaaviShoes;

/**
 * muas-tx00cf83-3002
 *
 * @author diftraku
 * @package muas-tx00cf83-3002
 * @copyright Copyright (c) 2016, Diftraku
 * @license https://opensource.org/licenses/MIT The MIT License (MIT)
 */

public class JasperSlaaviFactory extends Jasper {
    @Override
    public Jasper setJasper() {
        this.hat = new SlaaviHat();
        this.shirt = new SlaaviShirt();
        this.pants = new SlaaviPants();
        this.shoes = new SlaaviShoes();
        return this;
    }
}
