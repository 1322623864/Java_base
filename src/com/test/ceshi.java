package com.test;

import java.util.Scanner;

public class ceshi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()){
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            System.out.println("i"+i);
            System.out.println("j"+j);
        }


    }
}
