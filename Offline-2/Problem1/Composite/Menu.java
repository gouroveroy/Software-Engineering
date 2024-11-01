package Composite;

public interface Menu {
    public void setName(String name);

    public void setPrice(int price);

    public String getName();

    public int getPrice();

    public void setDiscountPercentage(float discountPercentage);

    public void add(Menu item);

    public void remove(Menu item);

    public abstract void print();
}
