package com.thread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Download extends Thread{
    private String url;
    private String name;

    public Download(String url,String name){
        this.url = url;
        this.name = name;
    }

    @Override
    public void run() {
     WebDownloader webDownloader = new WebDownloader();
     webDownloader.downloader(url,name);
        System.out.println("成功下载文件"+name);
    }
    public static void main(String[] args) {
        Download t1 = new Download("https://i0.hdslb.com/bfs/feed-admin/38bc9bfe5224a24ca8b4d731042360c19028c821.jpg@336w_190h_1c.webp","p1.jpg");
        Download t2 = new Download("https://i0.hdslb.com/bfs/archive/fc35ecfc584557c3fddf11bf33dc9f258dfe8ccb.jpg@336w_190h_1c.webp","p2.jpg");
        Download t3 = new Download("https://i1.hdslb.com/bfs/archive/de036489d36987cc761d9fc95f8dbf76ef99a591.jpg@336w_190h_1c.webp","p3.jpg");
        t1.start();
        t2.start();
        t3.start();
    }
}




class WebDownloader{
    public void downloader (String url,String name){
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println();
        }

    }
}