package com.zds.interview.t1;

public class Test {
    public void add(Byte b){
        b=b++;
    }
    public void test(){
        Byte a = 127;
        Byte b = 127;
        add(++a);
        System.out.println(a+"");
        add(b);
        System.out.println(b+"");

    }

    public static void main(String[] args) {
//        new Test.test();
        Byte a = 127;
        int b = ++a;
        System.out.println(b);

        System.out.println(b++);


    }





}
