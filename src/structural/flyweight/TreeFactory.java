package structural.flyweight;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private Map<Color, Tree> coniferTreeMap = new HashMap<>();
    private Map<Color, Tree> decidousTreeMap = new HashMap<>();

    public Tree getTree(Color color, boolean conifer) {
        if (conifer) {
            return coniferTreeMap.computeIfAbsent(color, ConiferTree::new);
        } else {
            return decidousTreeMap.computeIfAbsent(color, DecidousTree::new);
        }
    }
}
