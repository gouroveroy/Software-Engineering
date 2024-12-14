public class Main {
    public static void main(String[] args) {
        Component cpu = new Simple("CPU (Intel i9)", 500);
        Component memory = new Simple("16GB RAM", 150);
        Component storage = new Simple("1TB SSD", 200);
        Component gpu = new Simple("Graphics Card (RTX 4090)", 1500);

        Bundle bundle1 = new Bundle();
        bundle1.addComponent(cpu);
        bundle1.addComponent(memory);

        Bundle bundle2 = new Bundle();
        bundle2.addComponent(storage);
        bundle2.addComponent(gpu);

        Bundle bundle3 = new Bundle();
        bundle3.addComponent(bundle1);
        bundle3.addComponent(bundle2);

        bundle3.printDetails();
        System.out.println("Total Price: $" + bundle3.getPrice());
    }
}
