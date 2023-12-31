package structural.adapter.example;

public class Paypal implements PaymentProvider{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment with Paypal: " + amount + "$");
    }
}
