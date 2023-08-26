public class CarSimulator {
    private CarBuilder carBuilder;
    private Car car;

    public CarSimulator(){
        this.carBuilder = new CarBuilder();
    }
    public void buildCar(int power, float volume, int torque, int size, String name){
        car = carBuilder.buildCar(power, volume, torque, size, name);
        System.out.println(car.getName() + " power " +  car.getEngine().getPower() + " hp, torque " + car.getEngine().getTorque() + " N m, volume " + car.getEngine().getVolume() + " l, wheel size " + car.getWheel().getSize() + " in.");
    }
}
