package behavioral.chain;

public class SmallPurchaseHandler implements PurchaseHandler{
    private static  final double MAX_PRICE = 1000;

    @Override
    public void handleRequest(PurchaseRequest request) {
        if (request.getPrice() <= MAX_PRICE) {
            System.out.println("SmallPurchaseHandler approved request# " + request.getPrice());
        } else {
            System.out.println("SmallPurchaseHandler rejected request# " + request.getPrice());
        }
    }
}
