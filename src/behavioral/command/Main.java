package behavioral.command;

public class Main {
    public static void main(String[] args) {
        var light = new Light();
        var turnOnCommand = new TurnOnCommand(light);
        var turnOfCommand = new TurnOfCommand(light);

        var remoteControl = new RemoteControl();
        remoteControl.setCommand(turnOnCommand);
        remoteControl.pressButton();

        remoteControl.setCommand(turnOfCommand);
        remoteControl.pressButton();
    }
}
