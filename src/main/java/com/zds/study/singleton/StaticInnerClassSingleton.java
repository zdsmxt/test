package com.zds.study.singleton;
// 静态内部类的优点是:在外部类被加载的时候,内部类并不会被立即加载,
// 内部类没有被加载,单例对象也就没有进行实例化,从而也不会占内存。
// 只有在第一次访问内部类中的属性时才会加载内部类
// 并将内部类中的对象进行实例化。这种方法不仅可以确保线程的安全和对象唯一,也延迟了单例对象的实例化
public class StaticInnerClassSingleton {
    //构造私有化
    private  StaticInnerClassSingleton(){};
    //静态内部类,外部类被加载时,内部类不会被加载
    private  static  class StaticInnerClass {
        // 静态初始化器，由JVM来保证线程安全
        private  static StaticInnerClassSingleton staticInnerClassSingleton=new StaticInnerClassSingleton();
    }

    public  static  StaticInnerClassSingleton getStaticInnerClassSingleton(){
        //此时开始加载内部类,并将对象进行实例化
        return StaticInnerClass.staticInnerClassSingleton;
    }

}
