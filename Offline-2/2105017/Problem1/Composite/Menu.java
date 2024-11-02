package Composite;

public interface Menu {
    String getName();

    void setPrice(int price);

    int getPrice();

    void setDiscountPercentage(int discountPercentage);

    void add(Menu item, boolean isFree);

    void remove(Menu item);

    void print();
}
