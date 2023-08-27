public abstract class Drink {
    protected String name;
    protected double baseCost;

    protected CoffeeComponent coffeeComponent;

    public Drink() {
        coffeeComponent = new CoffeeComponent();
    }

    public String getName() {
        return name;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public double getComponentCost(String componentName) {
        return coffeeComponent.getComponentCost(componentName);
    }

    public abstract double calculateProfit();

    public void prepare() {
        System.out.println("Preparing " + name + "...");
    }
}