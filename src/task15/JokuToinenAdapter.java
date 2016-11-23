package task15;

/**
 * muas-tx00cf83-3002
 *
 * @author diftraku
 * @package muas-tx00cf83-3002
 * @copyright Copyright (c) 2016, Diftraku
 * @license https://opensource.org/licenses/MIT The MIT License (MIT)
 */

public class JokuToinenAdapter implements JokuAdapterRajapinta {
    JokuToinenRajapinta jokuObjekti;
    public JokuToinenAdapter(JokuToinenRajapinta jokuObjekti) {
        this.jokuObjekti = jokuObjekti;
    }

    @Override
    public void foo() {
        jokuObjekti.fizzbuzz();
    }

    @Override
    public void bar() {
        jokuObjekti.buzzfizz();
    }
}
