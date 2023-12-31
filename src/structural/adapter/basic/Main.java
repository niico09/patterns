package structural.adapter.basic;

public class Main {
    public static void main(String[] args) {
        var adaptee = new Adaptee();
        var adapter = new Adapter(adaptee);
        adapter.request();
    }
}
