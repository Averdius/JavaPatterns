public class BankAccount implements PaymentStrategy {
    @Override
    public void makePayment(int amount){
        System.out.println("Payment complete.\n" + amount + " through bank account");
    }
}
