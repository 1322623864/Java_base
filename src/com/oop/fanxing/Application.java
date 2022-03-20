package com.oop.fanxing;

public class Application {
    public static void main(String[] args) {
        Fanxing<String> fanxing = new Fanxing<>();
        fanxing.t = "hello";
        fanxing.show("ee");
        String string = fanxing.getT();
        System.out.println(fanxing.t+string);
        System.out.println("--------------------------");
        FanxingMethod fanxingMethod = new FanxingMethod();
        fanxingMethod.show(123);
        fanxingMethod.show("ahhah");
        fanxingMethod.show(56.8);




    }

}
