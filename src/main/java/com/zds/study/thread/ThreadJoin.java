package com.zds.study.thread;

//观察join 方法
public class ThreadJoin {

    public static void main(String[] args) throws InterruptedException{

        Thread t1 =null;
        Thread t2 =null;
        Thread t3 =null;
            t1=new Thread(()->{
                System.out.println("T1============");
            });
            t2=new Thread(()->{
                System.out.println("T2============");
            });
            t3=new Thread(()-> {
                System.out.println("T3============");

            });

//        for (int i = 0; i < 2; i++) {
            t1.start();
            t2.start();
            t3.start();
//            t1.join();
            t2.join();
            t3.join();


//        }

        System.out.println("main end");
    }

}
