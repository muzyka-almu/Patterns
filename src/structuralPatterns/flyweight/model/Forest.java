package structuralPatterns.flyweight.model;

import structuralPatterns.flyweight.factory.TreeFactory;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Forest {
    private List<Tree> trees = new ArrayList<>();

    public void plantTree(Integer x, Integer y, String name, Color color) {
        TreeType type = TreeFactory.getTreeType(name, color);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    public Integer getTreesCount() {
        return trees.size();
    }

    public void paint() {
        for (Tree tree : trees) {
            tree.draw();
        }
    }
}
