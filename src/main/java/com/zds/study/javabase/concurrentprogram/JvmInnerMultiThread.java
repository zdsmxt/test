package com.zds.study.javabase.concurrentprogram;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

//虚拟机内部的多线程
public class JvmInnerMultiThread {

    public static void main(String[] args) {
        //虚拟机线程管理的接口   jdk内部的管理工厂 里面的多个线程的多个bean的管理
        //这个类与工厂设计模式 有什么关系
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        ThreadInfo[] threadInfos =
                threadMXBean.dumpAllThreads(false, false);
        for (ThreadInfo threadInfo : threadInfos) {
            System.out.println("[" + threadInfo.getThreadId() + "]" + " "
                    + threadInfo.getThreadName());
        }

//        [6] Monitor Ctrl-Break 内部监控线程
//        [5] Attach Listener    依赖附属的 监听线程
//        [4] Signal Dispatcher  信号调度线程
//        [3] Finalizer          jvm 垃圾回收时
//        [2] Reference Handler  涉及强弱软虚 引用的处理
//        [1] main               主线程

    }

}
