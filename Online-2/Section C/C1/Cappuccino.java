public class Cappuccino extends Decorator {
    public Cappuccino(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", cinnamon powder";
    }

    @Override
    public int getCost() {
        return super.getCost() + 50;
    }
}
