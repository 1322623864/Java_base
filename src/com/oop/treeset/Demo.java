package com.oop.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        TreeSet<Preson> trees = new TreeSet<>(new Comparator<Preson>() {
            @Override
            public int compare(Preson o1, Preson o2) {
               int n1 = o1.getAge()- o2.getAge();
               int n2 = o1.getName().compareTo(o2.getName());
                return n1==0?n2:n1;
            }


        });
        Preson p1 = new Preson("ahaha",58);
        Preson p2 = new Preson("xixixi",15);
        Preson p3 = new Preson("lalala",47);
        trees.add(p1);
        trees.add(p2);
        trees.add(p3);
        System.out.println(trees.toString());
    }
}
