public class Main {
    public static void main(String[] args) {
        DrinkFactory coffeeShop = new DrinkFactory();

        coffeeShop.takeOrder("Espresso");
        coffeeShop.takeOrder("Cappuccino");
        coffeeShop.takeOrder("Latte");
        coffeeShop.takeOrder("Americano");

        double totalProfit = coffeeShop.calculateTotalProfit();
        System.out.println("Total profit: " + totalProfit);
    }
}