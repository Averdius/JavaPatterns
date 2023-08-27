public class Cappuccino extends Drink {
    public Cappuccino() {
        name = "Cappuccino";
        baseCost = 35;
    }

    @Override
    public double calculateProfit() {
        double totalProfit = getBaseCost() - getComponentCost("EspressoShot") - getComponentCost("Milk");
        return totalProfit;
    }
}
