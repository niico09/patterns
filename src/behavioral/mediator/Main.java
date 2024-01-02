package behavioral.mediator;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new ChatMediator();

        Colleague colleague1 = new ChatUser("User1", mediator);
        Colleague colleague2 = new ChatUser("User2", mediator);
        Colleague colleague3 = new ChatUser("User3", mediator);

        ((ChatMediator) mediator).addColleague(colleague1);
        ((ChatMediator) mediator).addColleague(colleague2);
        ((ChatMediator) mediator).addColleague(colleague3);


        colleague1.sendMessge("Hola a todos!");
        colleague2.sendMessge("¡Hola, Usuario1!");

    }
}
