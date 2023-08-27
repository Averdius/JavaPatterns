public class Client {
    public static void main(String[] args) {

        Lamp kitchenLamp = new Lamp("Kitchen");
        Lamp hallLamp = new Lamp("Hall");
        Lamp bedroomLamp = new Lamp("Bedroom");
        Lamp bathroomLamp = new Lamp("Bathroom");

        Controller controllerKitchenLamp = new Controller();
        Controller controllerHallLamp = new Controller();
        Controller controllerBedroomLamp = new Controller();
        Controller controllerBathroomLamp = new Controller();
        Controller controllerUniversal = new Controller();

        Command kitchenLampOn = new LightOn(kitchenLamp);
        Command hallLampOn = new LightOn(hallLamp);
        Command bedroomLampOn = new LightOn(bedroomLamp);
        Command bathroomLampOn = new LightOn(bathroomLamp);

        Command kitchenLampOff = new LightOff(kitchenLamp);
        Command hallLampOff = new LightOff(hallLamp);
        Command bedroomLampOff = new LightOff(bedroomLamp);
        Command bathroomLampOff = new LightOff(bathroomLamp);

        Command universalOff = new UniversalOff(controllerKitchenLamp, controllerHallLamp, controllerBedroomLamp, controllerBathroomLamp);

        controllerKitchenLamp.setCommand(kitchenLampOn, kitchenLampOff);
        controllerHallLamp.setCommand(hallLampOn, hallLampOff);
        controllerBedroomLamp.setCommand(bedroomLampOn, bedroomLampOff);
        controllerBathroomLamp.setCommand(bathroomLampOn, bathroomLampOff);

        // Simulation
        controllerKitchenLamp.on();
        controllerHallLamp.on();
        controllerBedroomLamp.on();

        controllerKitchenLamp.off();
        controllerHallLamp.off();
        controllerBedroomLamp.off();

        controllerBedroomLamp.on();
        controllerBathroomLamp.on();

        controllerUniversal.setCommand(universalOff,null);
        controllerUniversal.off();
    }
}