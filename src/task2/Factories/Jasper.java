package task2.Factories;
import task2.Clothing.*;

/**
 * muas-tx00cf83-3002
 *
 * @author diftraku
 * @package muas-tx00cf83-3002
 * @copyright Copyright (c) 2016, Diftraku
 * @license https://opensource.org/licenses/MIT The MIT License (MIT)
 */

public abstract class Jasper implements JasperIF {
    Hat hat;
    Shirt shirt;
    Pants pants;
    Shoes shoes;

    @Override
    public String toString() {
        return "Jasper{" +
                "hat=" + hat +
                ", shirt=" + shirt +
                ", pants=" + pants +
                ", shoes=" + shoes +
                '}';
    }

    Jasper() {
        this.setJasper();
    }
}
