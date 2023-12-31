package structural.flyweight;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        var treeFactory = new TreeFactory();

        var greenConfier = treeFactory.getTree(Color.GREEN, Boolean.TRUE);
        var blueConfier = treeFactory.getTree(Color.BLUE, Boolean.TRUE);

        greenConfier.display(1, 2);
        blueConfier.display(3, 4);

        var redDecidous = treeFactory.getTree(Color.RED, Boolean.FALSE);
        var yellowDecidous = treeFactory.getTree(Color.YELLOW, Boolean.FALSE);

        redDecidous.display(5, 6);
        yellowDecidous.display(7, 8);

    }

}
