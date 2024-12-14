abstract class Decorator implements Coffee {
    private Coffee coffee;

    public Decorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getIngredients() {
        return coffee.getIngredients();
    }

    @Override
    public int getCost() {
        return coffee.getCost();
    }
}
