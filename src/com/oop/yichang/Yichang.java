package com.oop.yichang;

public class Yichang {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        try{
            System.out.println(a/b);
        } catch (ArithmeticException e){
            System.out.println("输入错误");
        }finally {
            System.out.println("结束");

        }


    }
}
