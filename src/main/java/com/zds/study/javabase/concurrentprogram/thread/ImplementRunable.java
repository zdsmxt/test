package com.zds.study.javabase.concurrentprogram.thread;

public class ImplementRunable implements Runnable {
    @Override
    public void run() {
        System.out.println("通过实现 runnable接口创建线程"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        new ImplementRunable().run();
        ImplementRunable implementRunable = new ImplementRunable();
        new Thread(implementRunable).start();
        new Thread(new ImplementRunable()).start();


    }
}
