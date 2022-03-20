package com.thread;

public class Chuangjian extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("哈哈哈哈"+i);
        }
    }

    public static void main(String[] args) {
        Chuangjian chuangjian = new Chuangjian();
        chuangjian.start();
        for (int i = 0; i < 200; i++) {
            System.out.println("我是你爹"+i);
        }
    }
}
