import java.util.ArrayList;
import java.util.List;
class DrinkFactory {
    private final List<Drink> orders;

    public DrinkFactory() {
        orders = new ArrayList<>();
    }

    public void takeOrder(String type) {
        Drink drink = createDrink(type);
        if (drink != null) {
            orders.add(drink);
        } else {
            System.out.println("Sorry, we don't serve " + type);
        }
    }

    private Drink createDrink(String type) {
        if (type.equals("Espresso")) {
            return new Espresso();
        } else if (type.equals("Americano")) {
            return new Americano();
        } else if (type.equals("Cappuccino")) {
            return new Cappuccino();
        } else if (type.equals("Latte")) {
            return new Latte();
        }
        return null;
    }

    public double calculateTotalProfit() {
        double totalProfit = 0.0;
        for (Drink drink : orders) {
            double drinkProfit = drink.calculateProfit();
            totalProfit += drinkProfit;
        }
        return totalProfit;
    }
}