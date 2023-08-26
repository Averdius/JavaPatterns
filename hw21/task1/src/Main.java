public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setPaymentStrategy(new BankAccount());
        customer.pay(100);
        customer.setPaymentStrategy(new PayPal());
        customer.pay(1000);
        customer.setPaymentStrategy(new GooglePay());
        customer.pay(10000);
    }

}