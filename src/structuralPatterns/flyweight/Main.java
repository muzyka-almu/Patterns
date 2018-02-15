package structuralPatterns.flyweight;

import structuralPatterns.flyweight.factory.TreeFactory;
import structuralPatterns.flyweight.model.Forest;
import structuralPatterns.flyweight.model.TreeType;

import java.awt.*;
import java.util.Random;


public class Main {
    static Integer MAX_REND_NUMBER = 1000;
    static Integer TREES_TO_DRAW = 1000000;
    static Integer TREE_TYPES = 2;
    static Random rand = new Random();

    public static void main(String ...args) {
        Forest forest = new Forest();
        for (Integer i = 0; i < Math.floor(TREES_TO_DRAW / TREE_TYPES); i++) {
            forest.plantTree(rand.nextInt(MAX_REND_NUMBER), rand.nextInt(MAX_REND_NUMBER),"Summer Oak", Color.GREEN);
            forest.plantTree(rand.nextInt(MAX_REND_NUMBER), rand.nextInt(MAX_REND_NUMBER),"Autumn Oak", Color.ORANGE);
        }

        System.out.println("Tree count = " + forest.getTreesCount());
        System.out.println("Tree types count = " + TreeFactory.getTreeTypesCount());
        // The main idea of spend less memory! We move the same data(tree type) from tree to separate object and all tree objects have to link to one the same tree type
    }
}
