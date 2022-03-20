package com.base;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Tiaojian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String i = scanner.next();
        switch (i){
            case "haha":
                System.out.println("啊这");
                break;
            case "az":
                System.out.println("哈哈");
                break;
            default:
                System.out.println("你好");
        }
        scanner.close();
    }
}
