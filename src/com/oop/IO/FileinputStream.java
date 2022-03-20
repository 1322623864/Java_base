package com.oop.IO;

import java.io.FileInputStream;
import java.io.IOException;

public class FileinputStream {
    public static void main(String[] args) throws IOException {
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream("E:\\123.txt");
        byte[] buf = new byte[1024];
        int count = fileInputStream.read(buf);
        System.out.println(new String(buf,0,count));
        System.out.println(count);
        fileInputStream.close();
        System.out.println("END");
    }


}
