package com.zds.study.jvm.method.overload;

//方法调用里面的静态分派
public class StaticDispatch {

    static abstract class Human{}
    static  class Man extends Human{}
    static  class Woman extends Human{}

    public void sayHello(Human human){
        System.out.println("hello,human!");
    }
    public void sayHello(Man man){
        System.out.println("hello,man!");
    }
    public void sayHello(Woman woman){
        System.out.println("hello,woman!");
    }

    public static void main(String[] args) {
        Human h1 = new Man();
        Human h2 = new Woman();
        StaticDispatch sd = new StaticDispatch();
         sd.sayHello(h1);
         sd.sayHello(h2);
//         hello,human!
//         hello,human!
    }
}
