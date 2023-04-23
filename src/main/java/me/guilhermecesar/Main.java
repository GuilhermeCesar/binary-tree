package me.guilhermecesar;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Tree tree = new Tree();

        for (int i =0;i<10;i++){
            tree.insert(random.nextInt(100), tree.getRoot());
        }

        System.out.println("\n PRE-ORDER: ");
        tree.preOrder(tree.getRoot());

        System.out.println("\n IN-ORDER:");
        tree.inOrder(tree.getRoot());

        System.out.println("\n POS-ORDER:");
        tree.posOrder(tree.getRoot());
    }
}