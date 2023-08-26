public class MultiplicationHandler extends OperationHandler {
    @Override
    protected boolean canHandle(String operation) {
        return operation.equals("*");
    }

    @Override
    protected void executeOperation(int number1, int number2, String operation) {
        int result = number1 * number2;
        System.out.println("Результат множення: " + result);
    }
}