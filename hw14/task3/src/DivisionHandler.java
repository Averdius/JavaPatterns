public class DivisionHandler extends OperationHandler {
    @Override
    protected boolean canHandle(String operation) {
        return operation.equals("/");
    }

    @Override
    protected void executeOperation(int number1, int number2, String operation) {
        if (number2 != 0) {
            double result = (double) number1 / number2;
            System.out.println("Результат ділення: " + result);
        } else {
            System.out.println("Ділення на нуль неможливе");
        }
    }
}
