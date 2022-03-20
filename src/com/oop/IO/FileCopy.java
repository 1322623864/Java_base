package com.oop.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("E:\\123.jpg");
        FileOutputStream fileOutputStream = new FileOutputStream("E:\\321.jpg");
        byte[] buf = new byte[1024];
        int count = 0;
        while((count=fileInputStream.read(buf))!=-1){
            fileOutputStream.write(buf,0,count);
        }
        fileInputStream.close();
        fileOutputStream.close();
        System.out.println("Over");

    }


}
