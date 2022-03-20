package com.thread;

import com.test.Str;

public class lampmethod {
    public static void main(String[] args) {
        TV tv = new TV();
        new Player(tv).start();
        new Watcher(tv).start();

    }
 //产品-->节目
 static class TV {
     //演员表演 观众等待 T
     //观众观看 演员表演 F
     String voice;
     boolean flag = true;

     //表演
     public synchronized void play(String voice) {
         if (!flag) {
             try {
                 this.wait();
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }
         System.out.println("演员去表演了" + voice);
         //通知观众观看
         this.notifyAll();
         this.voice = voice;
         this.flag = !this.flag;
     }
 public synchronized void watch(){
         if(flag){
             try {
                 this.wait();
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }
     System.out.println("观看了"+voice);
         //通知演员表演
     this.notifyAll();
     this.flag = !this.flag;
     }
 }
 static class Player extends Thread{
        TV tv = new TV();
        public Player(TV tv){
            this.tv = tv;
        }

     @Override
     public void run() {
         for (int i = 0; i < 20; i++) {
             if(i%2==0){
                 this.tv.play("快乐大本营播放中");
             }else{
                 this.tv.play("送礼接送脑白金");
             }
         }
     }
 }
 static class Watcher extends Thread{
     TV tv = new TV();
     public Watcher(TV tv){
         this.tv = tv;
     }

     @Override
     public void run() {
         for (int i = 0; i < 20; i++) {
             tv.watch();
         }
     }
 }
}
