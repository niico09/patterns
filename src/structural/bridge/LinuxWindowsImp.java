package structural.bridge;

public class LinuxWindowsImp implements WindowImp {
    @Override
    public void drawWindow() {
        System.out.println("draw window on Linux");
    }
}
