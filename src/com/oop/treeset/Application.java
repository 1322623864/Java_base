package com.oop.treeset;

import java.util.TreeSet;

public class Application {
    public static void main(String[] args) {
        TreeSet<Preson> presons = new TreeSet<>();
        Preson p1 = new Preson("hahaha",58);
        Preson p2 = new Preson("xixixi",15);
        Preson p3 = new Preson("lalala",47);
        presons.add(p1);
        presons.add(p2);
        presons.add(p3);
        System.out.println(presons.toString());





    }
}
