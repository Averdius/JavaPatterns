public class Calculator {
    private OperationStrategy operationStrategy;

    public void setOperationStrategy(OperationStrategy operationStrategy){
        this.operationStrategy =  operationStrategy;
    }
    public void compute(double a, double b){
        operationStrategy.compute(a, b);
    }
}