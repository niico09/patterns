package structural.adapter.example;

public class StripeAdapter implements PaymentProvider{
    private Stripe stripe;

    public StripeAdapter(Stripe stripe) {
        this.stripe = stripe;
    }

    @Override
    public void processPayment(double amount) {
        var amountInDollars = amount * 0.85;
        stripe.makePayment(amountInDollars);
    }
}
