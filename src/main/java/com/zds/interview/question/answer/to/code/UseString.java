package com.zds.interview.question.answer.to.code;


//String 相关的问题
public class UseString {


    public static void main(String[] args) {

         whyUseFinalDecoratedString();




    }


    //为什么使用final 关键字修饰String
    public static String whyUseFinalDecoratedString(){
        //下面时一些 关联的知识点
        // 贴源码 public final class String
        // 本地缓存 字符串常量池
        //定义两个 值相等的字符串 但是用双等号== 比较
        String a ="1";
        String b ="1";
        String c ="11";
        String d =a+b;
        //创建一个String 对象 通过构造方法传值
        String e= new String("11");

        System.out.println("a=1   b=1    输出a==b的布尔值"+(a==b));
        System.out.println("c=11  d=a+b  输出c==d的布尔值"+(c==d));
        System.out.println("c=11  e= new String(\"11\")  输出c==e的布尔值"+(c==e));
        System.out.println("c=11  e= new String(\"11\")  输出e.equals(c)的布尔值"+(e.equals(c)));
        System.out.println("d=a+b e= new String(\"11\")  输出d==e的布尔值"+(d==e));
        System.out.println("d=a+b e= new String(\"11\")  输出e.equals(d)的布尔值"+(e.equals(d)));
        System.out.println("打印c的值位="+c+"\r\n和d的值为="+d+"\r\n和e的值为="+e);



        return "";
    }


    //理解值传递和应用传递
    public static String underStandValueTransferAndReference(){

        return "" ;
    }

}
