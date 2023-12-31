package structural.bridge;

public class IconWindow extends Window {
    public IconWindow(WindowImp imp) {
        super(imp);
    }

    @Override
    void drawContents() {
        System.out.println("draw icon");
        imp.drawWindow();
    }
}
