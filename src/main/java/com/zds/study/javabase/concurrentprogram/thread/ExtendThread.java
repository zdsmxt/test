package com.zds.study.javabase.concurrentprogram.thread;

public class ExtendThread extends Thread {

    public static void main(String[] args) {

        ExtendThread extendThread = new ExtendThread();
        System.out.println(currentThread().getName());
        extendThread.start();
        System.out.println();
        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.start();

    }

    static class ThreadDemo extends Thread{
        @Override
        public void run() {
            System.out.println("通过继承Thread，线程号:" + Thread.currentThread().getName());
        }
    }
}
