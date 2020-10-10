package com.zds.interview.code;

public class A {

    public static int x;
    static {
        x=B.y+1;
    }


    public static void main(String[] args) {

//        int add = EnumSingle.INSTANCE.add(1, 2);
//        System.out.println(add);

//        String a = "abc";
//        String b = "abc";
//        System.out.println(a==b);



//        float f = 3.4; wrong
        float f = 3.4F;
        float f1 = (float)3.4;


    }


}
