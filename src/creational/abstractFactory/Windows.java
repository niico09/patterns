package creational.abstractFactory;

public class Windows implements Notebook{
    @Override
    public void makeNote() {
        System.out.println("Making note from Windows");
    }
}
