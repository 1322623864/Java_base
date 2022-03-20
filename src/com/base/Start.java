package com.base;
import java.util.Scanner;

public class Start {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // int i = scanner.nextInt();
        //System.out.println(i);
        if(scanner.hasNext())
        {
            String str = scanner.next();
            System.out.println("输入的内容："+str);
        }
        //凡是属于IO流的类如果不关闭会一直占用资源，要养成习惯用完就关闭
        scanner.close();
    }
}
