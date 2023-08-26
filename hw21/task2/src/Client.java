public class  Client {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setOperationStrategy(new Addition());
        calculator.compute( 4,9);
        calculator.setOperationStrategy(new Subtraction());
        calculator.compute(9, -2);
        calculator.setOperationStrategy(new Multiplication());
        calculator.compute(2.2,2.8);
    }
}