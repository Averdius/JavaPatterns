public abstract class OperationHandler {
    protected OperationHandler nextHandler;

    public void setNextHandler(OperationHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleRequest(int number1, int number2, String operation) {
        if (canHandle(operation)) {
            executeOperation(number1, number2, operation);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(number1, number2, operation);
        } else {
            System.out.println("Неможливо обробити запит");
        }
    }

    protected abstract boolean canHandle(String operation);

    protected abstract void executeOperation(int number1, int number2, String operation);
}
