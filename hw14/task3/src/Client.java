public class Client {
    public static void main(String[] args) {
        OperationHandler additionHandler = new AdditionHandler();
        OperationHandler subtractionHandler = new SubtractionHandler();
        OperationHandler multiplicationHandler = new MultiplicationHandler();
        OperationHandler divisionHandler = new DivisionHandler();

        additionHandler.setNextHandler(subtractionHandler);
        subtractionHandler.setNextHandler(multiplicationHandler);
        multiplicationHandler.setNextHandler(divisionHandler);

        int number1 = 7;
        int number2 = -2;

        additionHandler.handleRequest(number1, number2, "+");
        additionHandler.handleRequest(number1, number2, "-");
        additionHandler.handleRequest(number1, number2, "*");
        additionHandler.handleRequest(number1, number2, "/");
        additionHandler.handleRequest(number1, number2, "^");
    }
}