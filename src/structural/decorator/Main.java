package structural.decorator;

public class Main {
    public static void main(String[] args) {
        var message = new SimpleMessage("Hello, world!");
        System.out.println(message.getContent());

        var htmlDecorator = new HtmlDecorator(message);
        var upperCaseDecorator = new UpperCaseDecorator(message);

        System.out.println(htmlDecorator.getContent());
        System.out.println(upperCaseDecorator.getContent());

    }
}
