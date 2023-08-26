public class CarBuilder {
    public Car buildCar(int power, float volume, int torque,  int size, String name) {
        Engine engine = new Engine(power, volume, torque);
        Wheel wheel = new Wheel(size);
        System.out.println("Car is built");
        return new Car(engine,wheel,name);
    }
}
