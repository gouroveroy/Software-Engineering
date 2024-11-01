package Decorator;

import Composite.*;

public class ComboDecorator implements Menu {
    protected Menu decoratorCombo;

    public ComboDecorator(Menu decoratorCombo) {
        this.decoratorCombo = decoratorCombo;
    }

    @Override
    public String getName() {
        return this.decoratorCombo.getName();
    }

    @Override
    public void setName(String name) {
        this.decoratorCombo.setName(name);
    }

    @Override
    public int getPrice() {
        return this.decoratorCombo.getPrice();
    }

    @Override
    public void setPrice(int price) {
        this.decoratorCombo.setPrice(price);
    }

    @Override
    public void setDiscountPercentage(float discountPercentage) {
        this.decoratorCombo.setDiscountPercentage(discountPercentage);
    }

    @Override
    public void add(Menu item) {
        decoratorCombo.add(item);
    }

    @Override
    public void remove(Menu item) {
        decoratorCombo.remove(item);
    }

    @Override
    public void print() {
        decoratorCombo.print();
    }
}
