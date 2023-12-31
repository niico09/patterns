package creational.abstractFactory;

public class AndroidFactory implements DevicesFactory {
    @Override
    public Phone createPhone() {
        return new Android();
    }

    @Override
    public Notebook createNotebook() {
        return new Windows();
    }
}
