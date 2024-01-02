package behavioral.mediator;

public class ChatUser implements Colleague{
    private String name;
    private Mediator mediator;

    public ChatUser(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(name + " received: " + message);
    }

    @Override
    public void sendMessge(String message) {
        System.out.println(name + " sent: " + message);
        mediator.sendMessage(this, message);
    }
}
