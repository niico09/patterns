package behavioral.chain;

public class LargePuchaseHandler implements PurchaseHandler{
    @Override
    public void handleRequest(PurchaseRequest request) {
        System.out.println("LargePuchaseHandler approved request# " + request.getPrice());
    }
}
