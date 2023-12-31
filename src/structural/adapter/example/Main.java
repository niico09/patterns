package structural.adapter.example;

public class Main {
    public static void main(String[] args) {
        PaymentProvider paymentProvider = new Paypal();
        paymentProvider.processPayment(100.0);

        Stripe stripe = new Stripe();
        PaymentProvider stripeAdapter = new StripeAdapter(stripe);
        stripeAdapter.processPayment(100.0);
    }
}
