package creational.abstractFactory;

public class Iphone implements Phone {
    @Override
    public void makeCall() {
        System.out.println("Making call from Iphone");
    }
}
