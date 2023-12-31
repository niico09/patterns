package creational.abstractFactory;

public class Main {
    public static void main(String[] args) {

        var android = new AndroidFactory();
        var phone = android.createPhone();
        var notebook = android.createNotebook();

        phone.makeCall();
        notebook.makeNote();

        var iphone = new AppleFactory();
        phone = iphone.createPhone();
        notebook = iphone.createNotebook();

        phone.makeCall();
        notebook.makeNote();
    }
}
