package creational.singleton;

public class Main {
    public static void main(String[] args) {
        var singleton = Singleton.getInstance();
        singleton.showMessage();
    }
}
