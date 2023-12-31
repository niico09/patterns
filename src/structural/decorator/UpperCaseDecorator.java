package structural.decorator;

public class UpperCaseDecorator extends HtmlDecorator {

    public UpperCaseDecorator(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        return super.getContent().toUpperCase();
    }
}
