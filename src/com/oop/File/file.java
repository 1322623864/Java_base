package com.oop.File;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class file {
    public static void main(String[] args) throws Exception {
        //fileOpe();
        files();
    }

    public static void fileOpe() throws Exception {
        File file = new File("d:\\file.txt");
        if (!file.exists()) {
            boolean b = file.createNewFile();
            System.out.println(b);
        }
    }

    public static void files() {
        File dir = new File("e:\\图片");
        String[] filess = dir.list();
        System.out.println("-------------------");
        for (String s : filess) {
            System.out.println(s);
        }
        File[] file2 = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.getName().endsWith(".jpg")) {
                    return true;
                }
                return false;
            }

        });
        for (File file : file2) {
            System.out.println(file.getName());
        }
    }

}




