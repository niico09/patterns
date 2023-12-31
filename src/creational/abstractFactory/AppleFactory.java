package creational.abstractFactory;

public class AppleFactory implements DevicesFactory{
    @Override
    public Phone createPhone() {
        return new Iphone();
    }

    @Override
    public Notebook createNotebook() {
        return new MacBook();
    }
}
