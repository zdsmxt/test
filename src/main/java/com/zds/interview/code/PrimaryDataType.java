package com.zds.interview.code;

public class PrimaryDataType {

    public static void main(String[] args) {


        short  s1 =1;
//        s1 = s1 + 1;
        s1 = (short)( s1 + 1);
        s1+=1;





        //===========================================

        Integer a = new Integer( 3 );
        Integer b = 3 ;
        // 将 3 自动装箱成 Integer 类型
        int c = 3 ;
//        System.out.println(a == b);
        System.out.println(a.equals(b));
        // false 两个引用没有引用同一对象
        System.out.println(a == c);
        // true a 自动拆箱成 int 类型再和 c


        //===========================================
        Integer f1=100,f2=100,f3=150,f4=150;

//
        System.out.println("1====================");
        System.out.println(f1==f2);
        System.out.println(f3==f4);
        System.out.println(f3.equals(f4));
        System.out.println(f1.equals(f2));




        System.out.println("2====================");
        String s = new StringBuilder( "go" )
                .append( "od" ).toString();
        System.out.println(s.intern() == s);
        String s2 = new StringBuilder( "ja" )
                .append( "va" ).toString();
        System.out.println(s2.intern() == s2);

        System.out.println("3====================");
//        long s3 =9999;
//        switch (s3){
//
//        }



        String ss = " ";
        ss.intern();

    }
}
