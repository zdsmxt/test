package com.zds.interview.code;
import sun.misc.Unsafe;

import java.util.concurrent.*;
import java.util.*;

//快速联想
public class QuickAssociation {

    String s = "";
    Integer i = 1;
    List list= new ArrayList<Integer>();
    Map<String, Integer> map = new HashMap<String, Integer> ();
    Map<String, Integer> linkedMap = new LinkedHashMap<>();
    Map<String, Integer> curmap = new ConcurrentHashMap<>();
    ExecutorService executor = Executors.newFixedThreadPool(1);
    Thread t = new Thread();
//    Unsafe.getUnsafe().putObject(s)
    //阻塞队列
    BlockingQueue lbq = new LinkedBlockingQueue();
    BlockingQueue abq = new ArrayBlockingQueue(3);



}
