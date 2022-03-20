package com.oop.IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Bufferinputstream {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("E:\\123.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        int data = 0;
        while((data = bufferedInputStream.read())!=-1){
            System.out.print((char) data);
        }
        bufferedInputStream.close();
    }
}
