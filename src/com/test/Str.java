package com.test;

public class Str {
public static void main(String[] args) {
    String str = "this is a text";
    String[] arr = str.split(" ");
    for (int i = 0; i < arr.length; i++) {
        char first = arr[i].charAt(0);
        char updateFirst = Character.toUpperCase(first);
        String news = updateFirst + arr[i].substring(1);
        System.out.println(news);

//        System.out.println(str.replace("text","practice"));

        }
    }
}

