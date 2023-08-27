public class WhippedCream extends Decorator {
    public WhippedCream(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description() {
        return beverage.description() + " + вершки";
    }

    @Override
    public float cost() {
        return beverage.cost() + 0.4f;
    }
}
