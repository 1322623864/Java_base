package com.oop.File;

import java.io.File;

public class files {
    public static void main(String[] args) {
    digui(new File("e://游戏数据"));
    }
    public static void digui(File dir){
        File[] files = dir.listFiles();
        System.out.println(dir.getAbsolutePath());
        if(files!=null&&files.length>0){
            for (File file : files) {
                if(file.isDirectory()){
                    digui(file);
                }
            }
        }
    }
}
