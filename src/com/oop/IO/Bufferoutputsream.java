package com.oop.IO;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Bufferoutputsream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("E:\\123.txt");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        for (int i=0;i<5;i++){
            bufferedOutputStream.write("helloworld\r\n".getBytes(StandardCharsets.UTF_8));
            bufferedOutputStream.flush();
        }
        bufferedOutputStream.close();
        System.out.println("Over");
    }
}
