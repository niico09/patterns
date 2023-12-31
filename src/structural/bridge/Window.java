package structural.bridge;

abstract class Window {
    protected WindowImp imp;

    public Window(WindowImp imp) {
        this.imp = imp;
    }
    abstract void drawContents();
}
