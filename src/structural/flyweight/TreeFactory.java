package structural.flyweight;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private Map<Color, Tree> coniferTreeMap = new HashMap<>();
    private Map<Color, Tree> decidousTreeMap = new HashMap<>();

    public Tree getTree(Color color, boolean conifer) {
        if (conifer) {
            Tree tree = coniferTreeMap.get(color);
            if (tree == null) {
                tree = new ConiferTree(color);
                coniferTreeMap.put(color, tree);
            }
            return tree;
        } else {
            Tree tree = decidousTreeMap.get(color);
            if (tree == null) {
                tree = new DecidousTree(color);
                decidousTreeMap.put(color, tree);
            }
            return tree;
        }
    }
}
