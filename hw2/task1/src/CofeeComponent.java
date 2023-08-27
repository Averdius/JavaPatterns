
import java.util.HashMap;
import java.util.Map;

class CoffeeComponent {
    private final Map<String, Double> componentCosts;

    public CoffeeComponent() {
        componentCosts = new HashMap<>();
        initializeComponentCosts();
    }

    private void initializeComponentCosts() {
        componentCosts.put("Milk", 5.0);
        componentCosts.put("EspressoShot", 7.0);
        componentCosts.put("Sugar", 3.0);
        componentCosts.put("WhippedCream", 10.0);
    }

    public double getComponentCost(String componentName) {
        return componentCosts.getOrDefault(componentName, 0.0);
    }
}