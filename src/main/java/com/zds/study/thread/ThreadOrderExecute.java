package com.zds.study.thread;

//如何保证线程顺序执行
public class ThreadOrderExecute {

    public static void main(String[] args)throws InterruptedException {

        Thread t1 =new Thread(()->{
            System.out.println("t1====>");
        });
        t1.start();
        t1.join();

        Thread t2 =new Thread(()->{
            System.out.println("t2====>");
        });
        t2.start();
        t2.join();

        Thread t3 =new Thread(()->{
            System.out.println("t3====>");
        });
        t3.start();
        t3.join();

//        t1====>
//        t2====>
//        t3====>

//        System.out.println("main end");






    }
}
