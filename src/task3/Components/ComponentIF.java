package task3.Components;

import java.util.ArrayList;

/**
 * muas-tx00cf83-3002
 *
 * @author diftraku
 * @package muas-tx00cf83-3002
 * @copyright Copyright (c) 2016, Diftraku
 * @license https://opensource.org/licenses/MIT The MIT License (MIT)
 */

public interface ComponentIF {
    void setType(String type);
    String getType();
    void setPrice(double price);
    double getPrice();
    void addComponent(Component component);
    Component getComponent(String component);
    ArrayList<Component> getComponents();
    int getComponentCount();
    String toString();
}
