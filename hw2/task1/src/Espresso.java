class Espresso extends Drink {
    public Espresso() {
        name = "Espresso";
        baseCost = 25;
    }

    @Override
    public double calculateProfit() {
        double totalProfit = getBaseCost() - getComponentCost("EspressoShot");
        return totalProfit;
    }
}