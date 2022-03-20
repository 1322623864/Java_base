package com.oop.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileoutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("E:\\aaa.txt",true);
        fileOutputStream.write(78);
        fileOutputStream.write('a');
        fileOutputStream.write('v');
        fileOutputStream.write('e');
        System.out.println();
        String s = "hello,world\r\n";
        fileOutputStream.write(s.getBytes(StandardCharsets.UTF_8));
        System.out.println("Over");
        fileOutputStream.close();

    }


}
