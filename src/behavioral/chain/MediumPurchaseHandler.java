package behavioral.chain;

public class MediumPurchaseHandler implements PurchaseHandler{
    private static  final double MAX_PRICE = 10000;
    private PurchaseHandler nextHandler;

    public MediumPurchaseHandler(PurchaseHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(PurchaseRequest request) {
        if (request.getPrice() <= MAX_PRICE) {
            System.out.println("MediumPurchaseHandler approved request# " + request.getPrice());
        } else {
            System.out.println("MediumPurchaseHandler rejected request# " + request.getPrice());
            nextHandler.handleRequest(request);
        }
    }
}
