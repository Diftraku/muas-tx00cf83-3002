package task3;

import task3.Components.Component;

import java.util.ArrayList;
import java.util.Objects;

/**
 * muas-tx00cf83-3002
 *
 * @author diftraku
 * @package muas-tx00cf83-3002
 * @copyright Copyright (c) 2016, Diftraku
 * @license https://opensource.org/licenses/MIT The MIT License (MIT)
 */

public class Computer {
    ArrayList<Component> components = new ArrayList<>();

    public ArrayList<Component> getComponents() {
        return this.components;
    }

    public void addComponent(Component component) {
        this.components.add(component);
    }

    public Component getComponent(String name) {
        for (Component component : components) {
            if(Objects.equals(component.getType(), name)) {
                return component;
            }
        }
        return null;
    }

    public void setComponents(ArrayList<Component> components) {
        this.components = components;
    }

    public int getComponentCount() {
        int count = 0;
        for (Component component : components) {
            count += component.getComponentCount();
        }
        return count;
    }

    public double getPrice() {
        double price = 0.00;
        for (Component component : components) {
            price += component.getPrice();
        }
        return price;
    }

    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("Computer\n");
        output.append("Price: ");
        output.append(this.getPrice());
        output.append("€\n");
        output.append("Total of ");
        output.append(this.getComponentCount());
        output.append(" components\n\n");
        components.forEach(output::append);

        return output.toString();
    }
}
