public class Simple implements Component {
    private String name;
    private int price;

    public Simple(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void printDetails() {
        System.out.println(name + ", Price: $" + price);
    }
}
