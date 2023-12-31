package structural.bridge;

import creational.abstractFactory.Windows;

public class DialogWindow extends Window {

    public DialogWindow(WindowImp imp) {
        super(imp);
    }

    @Override
    void drawContents() {
        System.out.println("draw dialog");
        imp.drawWindow();
    }
}
