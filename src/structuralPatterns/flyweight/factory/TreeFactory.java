package structuralPatterns.flyweight.factory;

import structuralPatterns.flyweight.model.TreeType;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, Color color) {
        TreeType result = treeTypes.get(name);

        if (result == null) {
            result = new TreeType(name, color);
            treeTypes.put(name, result);
        }

        return result;
    }

    public static Integer getTreeTypesCount() {
        return treeTypes.size();
    }
}
