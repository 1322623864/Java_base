package com.base;

public class Kebiancanshu {
    public static void main(String[] args) {
       printMax(2,3,8,6,4);
    }
    public static void printMax(double...numbers){
        if(numbers.length == 0){
            System.out.println("no numbers");
            return;
        }
        double result=numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]>result){
                result=numbers[i];
            }
        }
        System.out.println("max number:"+result);
    }
}

