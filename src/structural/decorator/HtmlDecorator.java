package structural.decorator;

public class HtmlDecorator extends MessageDecorator {

    public HtmlDecorator(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        return "<html><body>" + super.getContent() + "</body></html>";
    }
}
