public class Engine {
    private int power;
    private float volume;
    private int torque;
    public Engine(int power, float volume, int torque) {
        this.power = power;
        this.volume = volume;
        this.torque = torque;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }
}
