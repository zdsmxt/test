package com.zds.interview.t1;


class HelloA{


    public HelloA(){
        System.out.println("HelloA");
    }

    {
        System.out.println("A");
    }
    static{
        System.out.println("staticA");
    }


}
public class HelloB extends HelloA{
    public HelloB(){
        System.out.println("HelloB");
    }
    {
        System.out.println("B");
    }
    static{
        System.out.println("staticB");
    }

    public static void main(String[] args) {
        new HelloB();
    }


}


