import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Beverage espresso = new Espresso();
        espresso = new Sugar(espresso);
        espresso = new Sugar(espresso);
        System.out.println(espresso);

        Beverage darkRoast1 = new DarkRoast();
        darkRoast1 = new Sugar(darkRoast1);
        darkRoast1 = new Sugar(darkRoast1);
        darkRoast1 = new WhippedCream(darkRoast1);
        System.out.println(darkRoast1);

        Beverage darkRoast2 = new DarkRoast();
        darkRoast2 = new Sugar(darkRoast2);
        darkRoast2 = new Cream(darkRoast2);
        System.out.println(darkRoast2);

        Beverage decaf = new Decaf();
        decaf = new Milk(decaf);
        decaf = new Sugar(decaf);
        decaf = new Sugar(decaf);
        System.out.println(decaf);
    }
}