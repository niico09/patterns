package behavioral.mediator;

public interface Mediator {
    void sendMessage(Colleague sender, String message);
}
