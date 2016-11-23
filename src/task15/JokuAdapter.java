package task15;

/**
 * muas-tx00cf83-3002
 *
 * @author diftraku
 * @package muas-tx00cf83-3002
 * @copyright Copyright (c) 2016, Diftraku
 * @license https://opensource.org/licenses/MIT The MIT License (MIT)
 */

public class JokuAdapter implements JokuAdapterRajapinta {
    JokuRajapinta jokuObjekti;
    public JokuAdapter(JokuRajapinta jokuObjekti) {
        this.jokuObjekti = jokuObjekti;
    }

    @Override
    public void foo() {
        jokuObjekti.fizz();
    }

    @Override
    public void bar() {
        jokuObjekti.buzz();
    }
}
