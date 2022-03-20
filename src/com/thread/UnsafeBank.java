package com.thread;

public class UnsafeBank {
    public static void main(String[] args) {
        Account account = new Account(100,"留学基金");
        Drawing drawing1 = new Drawing(account,50,"myWife");
        Drawing drawing2 = new Drawing(account,100,"Jeffk");

        drawing1.start();
        drawing2.start();
    }
}

class Account{
    int money;
    String name;

    public Account(int money, String name) {
        this.money = money;
        this.name = name;
    }
}

class Drawing extends Thread{
    Account account;
    //取了多少钱
    int drawingMoney;
    //现在手上有多少钱
    int nowMoney;


    public Drawing(Account account,int drawingMoney,String name){
        super(name);
         this.account = account ;
         this.drawingMoney = drawingMoney ;

    }

    @Override
    public void run() {
        //上锁 锁的是变的对象 synchronized块默认是this
        synchronized (account){
            if(account.money-drawingMoney < 0){
                System.out.println(Thread.currentThread().getName()+"余额不足");
                return;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            account.money = account.money - drawingMoney;
            nowMoney = nowMoney + drawingMoney;

            System.out.println(account.name+"余额为"+account.money);
            System.out.println(this.getName()+"手上有"+nowMoney);
        }
        }

}