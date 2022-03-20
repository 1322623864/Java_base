package com.base;

public class Zhishu {
    public static void main(String[] args) {
        System.out.println("输出100以内的质数：");
        label:
        for (int i = 0; i < 100; i++) {
           for(int j=2;j<i/2;j++){
               if(i%j==0){
                   continue label;
               }
           }
            System.out.println(i+" ");
        }
    }
}
