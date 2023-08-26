public class Car {
    private Engine engine;
    private Wheel wheel;
    private String name;

    public Engine getEngine() {
        return engine;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public String getName() {
        return name;
    }

    public Car (Engine engine, Wheel wheel, String name){
        this.engine = engine;
        this.wheel = wheel;
        this.name = name;
    }

}
