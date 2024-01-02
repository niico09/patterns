package behavioral.chain;

public class Main {

    public static void main(String[] args) {

        var smallHandler = new SmallPurchaseHandler();
        var mediumHandler = new MediumPurchaseHandler(smallHandler);
        var largePurchaseHandler = new LargePuchaseHandler();

        smallHandler.handleRequest(new PurchaseRequest(100));
        System.out.println("-----------------------");
        mediumHandler.handleRequest(new PurchaseRequest(10000));
        System.out.println("-----------------------");
        largePurchaseHandler.handleRequest(new PurchaseRequest(10000));
    }
}
