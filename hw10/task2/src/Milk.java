public class Milk extends Decorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description() {
        return beverage.description() + " + молоко";
    }

    @Override
    public float cost() {
        return beverage.cost() + 0.25f;
    }
}
