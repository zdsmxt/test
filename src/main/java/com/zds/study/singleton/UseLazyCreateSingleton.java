package com.zds.study.singleton;

//单例之懒汉式
//线程不安全：最基础的实现方式，
//线程上下文单例，不需要共享给所有线程，也不需要加synchronize之类的锁，以提高性能
public class UseLazyCreateSingleton {
    //构造私有化
    private UseLazyCreateSingleton(){}
    //类加载的时候不进行初始化
    private static UseLazyCreateSingleton useLazyCreateSingleton= null;
    public  static UseLazyCreateSingleton getLazySingleton(){
        //当调用者需要获取一个对象的时候,首先判断当前的对象是否已经进行过实例化了?????
        if (useLazyCreateSingleton!=null){
            //当多个线程同时进入此处的时候,就无法保证是单例的了,因此这种方式是线程非安全的
            useLazyCreateSingleton=new UseLazyCreateSingleton();
        }
        return useLazyCreateSingleton;
    }

}
