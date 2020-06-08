package com.zds.study.jvm.method.overwrite;

public class DynamicDispatch {
    static abstract class Human{
        protected abstract void sayHello();
    }

    static class Man extends Human{

        @Override
        protected void sayHello() {
            System.out.println("hello,Man！");

        }
    }
    static class Woman extends Human{

        @Override
        protected void sayHello() {
            System.out.println("hello,Woman！");

        }
    }

    public static void main(String[]args){
        Human h1 = new Man();
        Human h2 = new Woman();
        h1.sayHello();
        h2.sayHello();

//        hello,Man！
//        hello,Woman！


    }
}
