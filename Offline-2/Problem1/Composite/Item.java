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
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void setDiscountPercentage(float discountPercentage) {

    }

    @Override
    public void add(Menu item) {

    }

    @Override
    public void remove(Menu item) {

    }

    @Override
    public void print() {
        System.out.println(this.name + " - " + price + "tk");
    }
}
