package me.guilhermecesar;

import java.util.Random;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        binaryTree();
        treeMap();
    }

    private static void binaryTree() {
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


    private static void treeMap(){
        Random random = new Random();
        System.out.println("\n\n===========TREEE MAP=======================");
        TreeMap<Integer, Integer> map=new TreeMap<>();

        for (int i =0;i<10;i++){
            var dataAndKey = random.nextInt(100);
            map.put(dataAndKey,dataAndKey);
        }

        map.entrySet().forEach(System.out::println);
    }
}