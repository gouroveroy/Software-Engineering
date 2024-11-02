package Composite;

import java.util.List;
import java.util.ArrayList;

public class Combo implements Menu {
    private List<Menu> items = new ArrayList<Menu>();
    private List<Menu> freeItems = new ArrayList<Menu>();
    private String name;
    private int price;
    private int discountPercentage = 0;

    public Combo(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        StringBuilder itemNames = new StringBuilder();
        items.forEach(item -> itemNames.append(item.getName()).append(" + "));
        freeItems.forEach(item -> itemNames.append(item.getName() + " (Free!!!)").append(" + "));
        if (itemNames.length() > 0) {
            itemNames.setLength(itemNames.length() - 3);
        }
        return this.name + (itemNames.length() > 0 ? " (" + itemNames + ")" : "");
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
        this.setPrice((int) Math.ceil(previousPrice * (1 - discountPercentage / 100.0)));
        return this.price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    public void setDiscountPercentage(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public void add(Menu item, boolean isFree) {
        (isFree ? freeItems : items).add(item);
    }

    @Override
    public void remove(Menu item) {
        if (!items.remove(item)) {
            freeItems.remove(item);
        }
    }

    @Override
    public void print() {
        items.forEach(item -> System.out.println("   -  " + item.getName()));
        freeItems.forEach(item -> System.out.println("   -  " + item.getName() + " (Free!!!)"));
        System.out.println("Total - " + (int) Math.ceil(items.stream().mapToInt(Menu::getPrice).sum()));
        System.out.println("Discount - " + discountPercentage + "%");
        System.out.println("Discounted total - " + getPrice() + "tk");
    }
}
