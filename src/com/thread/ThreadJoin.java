package com.thread;

public class ThreadJoin implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("我来插队了"+i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadJoin threadJoin = new ThreadJoin();
        Thread thread = new Thread(threadJoin);
        thread.start();
        for (int i = 0; i < 500; i++) {
            if(i == 100){
                thread.join();
            }
            System.out.println("程序运行"+i);
        }
    }
}
