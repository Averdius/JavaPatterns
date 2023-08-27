abstract public class Decorator extends Beverage {
    protected Beverage beverage;

    public Decorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public abstract String description();
}
