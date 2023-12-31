package structural.decorator;

public abstract class MessageDecorator implements Message{
    private Message message;

    public MessageDecorator(Message message) {
        this.message = message;
    }

    @Override
    public String getContent() {
        return message.getContent();
    }

}
