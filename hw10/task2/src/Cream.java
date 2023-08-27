public class Cream extends Decorator {
    public Cream(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description() {
        return beverage.description() + " + крем";
    }

    @Override
    public float cost() {
        return beverage.cost() + 0.3f;
    }
}
