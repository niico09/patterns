package structural.flyweight;

import java.awt.*;

public class ConiferTree implements Tree {

    private Color color;

    public ConiferTree(Color color) {
        this.color = color;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Conifer tree is located at " + x + ", " + y);
    }
}
