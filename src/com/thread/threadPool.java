package com.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class threadPool {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        service.execute(new myThread());
        service.execute(new myThread());
        service.execute(new myThread());
        service.execute(new myThread());
        service.execute(new myThread());

        service.shutdown();
    }
static class myThread implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

}
