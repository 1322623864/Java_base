package com.recursion;

public class Peach {
    public static void main(String[] args) {
        int num = jishu(1);
        System.out.println(num);
    }
    public static int jishu(int day){
        if(day == 10){
        return 1;
    }else if(day>=1&&day<=9){
          return ((jishu(day+1)+1)*2);
        }else{
            System.out.println("请输入1-10的数");
            return -1;
        }
    }
}



