package creational.abstractFactory;

public class MacBook implements Notebook{
    @Override
    public void makeNote() {
        System.out.println("Making note from MacBook");
    }
}
