package com.oop.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class Tree {
    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<>();
        tree.add("hahaha");
        tree.add("lalalal");
        tree.add("xixixi");
        System.out.println(tree.toString());
        for (String s : tree) {
            System.out.println(s);
        }
        System.out.println("==============================");
        Iterator<String> treeset = tree.iterator();
        while(treeset.hasNext()){
            String  s=treeset.next();
            System.out.println(s);
        }


    }
}
