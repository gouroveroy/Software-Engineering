public class BasicBlackCoffee implements Coffee {
    @Override
    public String getIngredients() {
        return "Water, grinded coffee beans";
    }

    @Override
    public int getCost() {
        return 130;
    }
}
