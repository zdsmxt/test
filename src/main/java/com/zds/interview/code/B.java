package com.zds.interview.code;

public class B {

    //通常单个类 先指向静态 在执行构造 如果是父子类 父类静态 子类静态
    //父类静态代码块–>子类静态代码块–>
    //父类代码块–>父类构造方法–>子类代码块–>子类构造方法
    public static int y = A.x+1;

    public static void main(String[] args) {
        System.out.println(String.format("X:%d,Y:%d",A.x,y));
    }

}
