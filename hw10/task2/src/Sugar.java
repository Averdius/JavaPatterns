public class Sugar extends Decorator {
    public Sugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description() {
        return beverage.description() + " + цукор";
    }

    @Override
    public float cost() {
        return beverage.cost() + 0.1f;
    }
}
