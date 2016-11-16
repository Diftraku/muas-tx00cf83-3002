package task10;

/**
 * muas-tx00cf83-3002
 *
 * @author diftraku
 * @package muas-tx00cf83-3002
 * @copyright Copyright (c) 2016, Diftraku
 * @license https://opensource.org/licenses/MIT The MIT License (MIT)
 */

public class WageRaiseRequest {
    private double old_wage;
    private double new_wage;

    public WageRaiseRequest(double old_wage, double new_wage) {
        this.old_wage = old_wage;
        this.new_wage = new_wage;
    }

    public double getOldWage() {
        return old_wage;
    }

    public void setOldWage(double old_wage) {
        this.old_wage = old_wage;
    }

    public double getNewWage() {
        return new_wage;
    }

    public void setNewWage(double new_wage) {
        this.new_wage = new_wage;
    }

    public double getIncreasePercentage() {
        double difference = this.new_wage - this.old_wage;
        return Math.round((difference / this.new_wage) * 100);
    }
}
