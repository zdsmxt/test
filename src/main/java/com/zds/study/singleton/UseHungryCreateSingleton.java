package com.zds.study.singleton;
// 使用饿汉式创建单例
//类加载的时候进行初始化,典型的以空间换时间,线程是安全的,无法做到延迟加载
public class UseHungryCreateSingleton {

    //构造私有化
    private UseHungryCreateSingleton(){}
    //类加载的时候直接实例化
    private  static UseHungryCreateSingleton useHungryCreateSingleton=new UseHungryCreateSingleton();

    public  static  UseHungryCreateSingleton getHungrySingleton()
    {
        return useHungryCreateSingleton;
    }
}
