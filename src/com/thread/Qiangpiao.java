package com.thread;

public class Qiangpiao implements Runnable{
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
        Qiangpiao qiangpiao = new Qiangpiao();
        new Thread(qiangpiao,"卫晨阳").start();
        new Thread(qiangpiao,"孙嘉旭").start();
        new Thread(qiangpiao,"张之路").start();
    }
}
