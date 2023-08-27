public class UniversalOff implements Command {
    private Controller[] controllers;

    public UniversalOff(Controller... controllers) {
        this.controllers = controllers;
    }

    @Override
    public void execute() {
        for (Controller controller : controllers) {
            controller.off();
        }
    }
}