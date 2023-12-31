package structural.adapter.example;

public class Stripe {
    void makePayment(double amount) {
        System.out.println("Making payment with Stripe: " + amount + "$");
    }
}
