package Decorator;

import Composite.*;

public class FreeItemDecorator extends ComboDecorator {
    public Menu freeItem = new Item("", 0);

    public FreeItemDecorator(Menu decoratorCombo, Menu freeItem) {
        super(decoratorCombo);
        this.freeItem.setName(freeItem.getName() + "(Free!!!)");
        this.freeItem.setPrice(0);
        decoratorCombo.add(this.freeItem);
    }

    @Override
    public void print() {
        decoratorCombo.print();
    }
}
