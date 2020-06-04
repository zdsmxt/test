package com.zds.study.singleton;

//单例之双重校验(懒汉式的线程安全版)
//双重校验是懒汉式的升级版,通过加锁实现了线程安全,并同时具备延迟加载的机制
//第一次判断doubleCheckSingleton== null为了避免非必要加锁，
//当第一次加载时才对实例进行加锁再实例化。这样既可以节约内存空间，又可以保证线程安全
//在JDK1.6及之后volatile可以解决DCL失效问题,volatile确保单例对象每次均在主内存中读取，
//这样虽然会牺牲一点效率，但也没有太多影响
public class DoubleCheckSingleton {
    //构造方法私有化
    private  DoubleCheckSingleton(){};
    //volatile用于保证内存可见性,所有线程都能看到共享内存的最新状态
    private  static volatile DoubleCheckSingleton doubleCheckSingleton=null;
    public  static  DoubleCheckSingleton getDoubleCheckSingleton(){
        if (doubleCheckSingleton!=null){
            //synchronized保证同时只能有一个线程进行实例化对象
            synchronized (DoubleCheckSingleton.class){
                if (doubleCheckSingleton!=null){
                    doubleCheckSingleton=new DoubleCheckSingleton();
                }
            }
        }
        return doubleCheckSingleton;
    }
}
