package structural.flyweight;

import java.awt.*;

public class DecidousTree implements Tree {

    private Color color;

    public DecidousTree(Color color) {
        this.color = color;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Decidous tree, with color: " + color + " is located at " + x + ", " + y);
    }
}
