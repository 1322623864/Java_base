package com.test;

import java.util.Scanner;

public class jisuanqi {
    static double result = 0;
    public static void main(String[] args) {
        System.out.println("请输入要处理的数字：");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextDouble()) {
            double i = scanner.nextDouble();
            double j = scanner.nextDouble();
            System.out.println("请输入要选择的处理模式:");
            Scanner num = new Scanner(System.in);
            String moshi = num.next();
            switch (moshi) {
                case "jia":
                    jia(i, j);
                    break;
                case "jian":
                    jian(i, j);
                    break;
                case "cheng":
                    cheng(i, j);
                    break;
                case "chu":
                    chu(i, j);
                    break;
                default:
                    System.out.println("未适配此功能");
            }
            System.out.println("计算结果为："+result );
        }
    }

    public static double jia(double i,double j){
        result =i+j;
        return result;
    }

    public static double jian(double i,double j){
        result =i-j;
        return result;
    }

    public static double cheng(double i,double j){
        result =i*j;
        return result;
    }

    public static double chu(double i,double j){
        result =i/j;
        return result;
    }
}




