package com.zds.study.singleton;

//枚举的特性:枚举实例不仅是线程安全的,而且在任何情况下它都是一个单例,枚举的属性都是静态常量。
//枚举单例可以自己处理序列化:传统的单例模式的另外一个问题是一旦你实现了serializable接口，
//他们就不再是单例的了，因为readObject()方法总是返回一个 新的实例对象，就像java中的构造器一样。你可以使用readResolve()方法来避免这种情况
public class EnumSingleton {

    //私有化构造
    private EnumSingleton(){};

    public static EnumSingleton getInstance() {

        return SingletonEnum.INSTANCE.getInstance();
    }

    private enum SingletonEnum {
        INSTANCE;

        private EnumSingleton singleton;

        // JVM保证这个方法绝对只调用一次
        SingletonEnum(){
            singleton = new EnumSingleton();
        }

        public EnumSingleton getInstance(){
            return singleton;
        }
    }
}
