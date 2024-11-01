package Composite;

import java.util.List;
import java.util.ArrayList;

public class Combo implements Menu {
    private List<Menu> items = new ArrayList<Menu>();
    private String name;
    private int price;
    private float discountPercentage;

    public Combo(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        StringBuilder itemNames = new StringBuilder();
        items.forEach(item -> itemNames.append(item.getName()).append(" + "));
        if (itemNames.length() > 0) {
            itemNames.setLength(itemNames.length() - 3);
        }
        return this.name + (itemNames.length() > 0 ? " (" + itemNames + ")" : "");
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getPrice() {
        if (this.price > 0) {
            return this.price;
        }
        int previousPrice = 0;
        for (Menu item : items) {
            previousPrice += item.getPrice();
        }
        return previousPrice;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    public void setDiscountPercentage(float discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public void add(Menu item) {
        items.add(item);
    }

    @Override
    public void remove(Menu item) {
        items.remove(item);
    }

    @Override
    public void print() {
        for (Menu item : items) {
            System.out.println("   -  " + item.getName());
        }
        int previousPrice = this.getPrice();
        System.out.println("Total - " + previousPrice);
        if (discountPercentage == (int) discountPercentage) {
            System.out.println("Discount - " + (int) discountPercentage + "%");
        } else {
            System.out.println("Discount - " + discountPercentage + "%");
        }
        System.out.println("Discounted total - "
                + (int) (Math.ceil(previousPrice - (previousPrice * discountPercentage / 100))) + "tk");
    }
}
