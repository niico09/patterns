package behavioral.command;

public class TurnOfCommand implements Command{
    private Light light;

    public TurnOfCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
