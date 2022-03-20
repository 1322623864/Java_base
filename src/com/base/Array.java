package com.base;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] a ={2,1,3,5,8,6,7,4};
        //Arrays.sort(a);
        Arrays.fill(a,2,4,0);
        System.out.println(Arrays.toString(a));
        System.out.println("==============================================");
int[][] array2={{1,2},{3,4}};
        for (int[] ints : array2) {
            for (int anInt : ints) {
                System.out.println(anInt+"\t");
            }
            

        }

    }
}
