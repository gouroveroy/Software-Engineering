public class BasicMilkCoffee implements Coffee {
    @Override
    public String getIngredients() {
        return "Milk, grinded coffee beans";
    }

    @Override
    public int getCost() {
        return 180;
    }
}
