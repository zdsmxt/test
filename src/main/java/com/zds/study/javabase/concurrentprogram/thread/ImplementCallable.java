package com.zds.study.javabase.concurrentprogram.thread;
import	java.util.concurrent.FutureTask;

import java.util.concurrent.Callable;

public class ImplementCallable implements Callable {
    @Override
    public Object call() throws Exception {
        return "实现了callable接口生成线程";
    }

    public static void main(String[] args) throws Exception {
        FutureTask futureTask = new FutureTask(new ImplementCallable());
        new Thread(futureTask).start();
        System.out.println(futureTask.get());
//        Thread.sleep(10);//等待线程执行结束
    }
}
