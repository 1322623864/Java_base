package com.thread;

public class pipMethod {
    public static void main(String[] args) {
       SynContainer container = new SynContainer();
       new Producter(container).start();
       new Consumer(container).start();
    }

static class Chicken{
        int id;

    public Chicken(int id) {
        this.id = id;
    }
}
    //生产者
    static class Producter extends Thread {
        SynContainer container;
        public Producter(SynContainer container){
            this.container = container;
        }

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                container.push(new Chicken(i));
                System.out.println("生产了"+i+"只鸡");
            }
        }
    }


    //消费者
    static class Consumer extends Thread {
        SynContainer container;

        public Consumer(SynContainer container) {
            this.container = container;
        }

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println("消费了" + container.pop().id + "只鸡");
            }
        }
    }

        //缓冲区
        static class SynContainer {
            //容器大小

            Chicken[] chickens = new Chicken[10];
            //容器计数器
            int count = 0;

            //生产者行为
            public synchronized void push(Chicken chicken) {
                //若容器满了，等待消费
                if (count == chickens.length) {
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //没满，丢入产品
                chickens[count] = chicken;
                count++;
                //通知消费者消费
                this.notifyAll();
            }


            //消费者模式
            public synchronized Chicken pop() {
                if (count == 0) {
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //可以开吃了
               count--;
                Chicken chicken = chickens[count];
                //吃完呢，通知生产
                this.notifyAll();
                return chicken;
            }
        }
    }


