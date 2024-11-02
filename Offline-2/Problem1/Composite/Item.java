package Composite;

public class Item implements Menu {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void setDiscountPercentage(int discountPercentage) {
        // Not applicable for individual items
    }

    @Override
    public void add(Menu item, boolean isFree) {
        // Not applicable for individual items
    }

    @Override
    public void remove(Menu item) {
        // Not applicable for individual items
    }

    @Override
    public void print() {
        System.out.println(name + " - " + price + "tk");
    }
}
