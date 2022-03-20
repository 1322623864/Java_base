package com.thread;

import java.util.concurrent.locks.ReentrantLock;

public class Safe_Qiangpiao implements Runnable{

    public static void main(String[] args) {
        Qiangpiao qiangpiao = new Qiangpiao();
        new Thread(qiangpiao,"卫晨阳").start();
        new Thread(qiangpiao,"孙嘉旭").start();
        new Thread(qiangpiao,"张之路").start();
    }

    private int ticketnum = 10;
    private final ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        while(true){
            try {
                lock.lock();//上锁
                if (ticketnum > 0) {
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "-->拿到了第" + ticketnum-- + "票");
                } else {
                    break;
                }
            }finally {
                lock.unlock();//解锁
            }
        }
    }


}

