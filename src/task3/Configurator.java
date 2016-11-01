package task3;

import task3.Components.Component;

import java.util.ArrayList;

/**
 * muas-tx00cf83-3002
 *
 * @author diftraku
 * @package muas-tx00cf83-3002
 * @copyright Copyright (c) 2016, Diftraku
 * @license https://opensource.org/licenses/MIT The MIT License (MIT)
 */

public class Configurator {
    public static void main(String[] args) {
        Computer pc = new Computer();
        Component mb = new Component("Motherboard", 100.00);
        mb.addComponent(new Component("CPU", 150.00));
        mb.addComponent(new Component("RAM", 100.00));
        mb.addComponent(new Component("GPU", 400.00));
        Component nic = new Component("NIC", 10.00);
        nic.setParent(mb);
        nic.addComponent(new Component("Tissit", 199.00));
        mb.addComponent(nic);
        Component koppa = new Component("Case", 99.99);
        mb.setParent(koppa);
        koppa.addComponent(mb);
        pc.addComponent(koppa);

        System.out.println(pc);
    }
}
