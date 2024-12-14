public class Americano extends Decorator {
    public Americano(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", grinded coffee beans";
    }

    @Override
    public int getCost() {
        return super.getCost() + 30;
    }
}
