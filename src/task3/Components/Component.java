package task3.Components;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * muas-tx00cf83-3002
 *
 * @author diftraku
 * @package muas-tx00cf83-3002
 * @copyright Copyright (c) 2016, Diftraku
 * @license https://opensource.org/licenses/MIT The MIT License (MIT)
 */

public class Component implements ComponentIF {
    protected String type;
    protected double price;
    protected Component parent;
    protected ArrayList<Component> children = new ArrayList<>();

    public Component(String type, double price) {
        this.type = type;
        this.price = price;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        double price = this.price;
        for (Component component : this.children) {
            price += component.getPrice();
        }
        return price;
    }

    @Override
    public void addComponent(Component component) {
        component.setParent(this);
        this.children.add(component);
    }

    @Override
    public Component getComponent(String name) {
        for (Component component : this.children) {
            if (component.getType().equals(name)) {
                return component;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Component> getComponents() {
        return this.children;
    }

    @Override
    public int getComponentCount() {
        int components = 1;
        for (Component component : this.children) {
            components += component.getComponentCount();
        }
        return components;
    }

    public Component getParent() {
        return parent;
    }

    public void setParent(Component parent) {
        this.parent = parent;
    }

    public int getDepth() {
        if (this.parent != null) {
            return this.parent.getDepth() + 1;
        }
        else {
            return 0;
        }
    }

    private String getPrefix() {
        int count = this.getDepth();
        String prefix = "";
        if (count > 1) {
            count--;
        }
        if (count > 0) {
            prefix = "|-";
        }
        char[] prefixChars = new char[count * 2];
        Arrays.fill(prefixChars, ' ');
        return new String(prefixChars) + prefix;
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        out.append(this.getPrefix());
        out.append(this.getType()).append("\n");
        for (Component component : this.children) {
            out.append(component);
        }
        return out.toString();
    }
}
