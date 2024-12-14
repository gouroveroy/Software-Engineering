import java.util.ArrayList;
import java.util.List;

public class Bundle implements Component {
    private List<Component> components;

    public Bundle() {
        this.components = new ArrayList<>();
    }

    public void addComponent(Component component) {
        components.add(component);
    }

    public void removeComponent(Component component) {
        components.remove(component);
    }

    @Override
    public int getPrice() {
        int totalPrice = 0;
        for (Component component : components) {
            totalPrice += component.getPrice();
        }
        return totalPrice;
    }

    public void printDetails() {
        for (Component component : components) {
            component.printDetails();
        }
    }
}
