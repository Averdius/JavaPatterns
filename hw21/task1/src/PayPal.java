public class PayPal implements PaymentStrategy {
    @Override
    public void makePayment(int amount){
        System.out.println("Payment complete.\n" + amount + " through PayPal");
    }
}
