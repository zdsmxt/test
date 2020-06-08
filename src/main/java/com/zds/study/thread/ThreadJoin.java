package com.zds.study.thread;

//观察join 方法
public class ThreadJoin {

    public static void main(String[] args) throws InterruptedException{
        Thread t1=new Thread(()->{
            System.out.println("T1============");
        });

        t1.start();
        t1.join();
        System.out.println("main end");
    }

}
