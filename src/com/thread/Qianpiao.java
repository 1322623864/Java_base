package com.thread;

public class Qianpiao implements Runnable{
    private int ticketnum = 10;
    @Override
    public void run() {
    while(true){
        if(ticketnum<=1){
            break;
        }
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"-->拿到了第"+ticketnum--+"票");
        }
    }

    public static void main(String[] args) {
        Qianpiao qianpiao = new Qianpiao();
        new Thread(qianpiao,"卫晨阳").start();
        new Thread(qianpiao,"孙嘉旭").start();
        new Thread(qianpiao,"张之路").start();
    }
}
