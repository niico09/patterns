package structural.bridge;

public class Main {
    public static void main(String[] args) {

        var windowsImp = new WindowsWindorImp();
        var linuxImp = new LinuxWindowsImp();

        var iconWindow = new IconWindow(windowsImp);
        var dialogWindow = new DialogWindow(linuxImp);

        iconWindow.drawContents();
        dialogWindow.drawContents();
    }
}
