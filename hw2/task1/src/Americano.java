public class Americano extends Drink {
    public Americano() {
        name = "Americano";
        baseCost = 30;
    }

    @Override
    public double calculateProfit() {
        return getBaseCost();
    }
}
