public class Latte extends Drink {
    public Latte() {
        name = "Latte";
        baseCost = 40;
    }

    @Override
    public double calculateProfit() {
        double totalProfit = getBaseCost() - getComponentCost("EspressoShot") - getComponentCost("Milk");
        return totalProfit;
    }
}
