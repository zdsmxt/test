package com.zds.study.datastructure.recursion;

import java.util.ArrayList;
import java.util.List;

// 用循环和累加的两种方式 来计算累加
public class Accumulation {

    public static void main(String[] args) {
        //构造一个待求和的数组
        ArrayList sumArray = new ArrayList();
        for (int i = 0; i <=100; i++) {
            sumArray.add(i);
        }

        System.out.println(sumUseFor(sumArray));


        System.out.println(sumUseRecursion(100));

        System.out.println(multiUseRecursion(5));
    }

    //使用for循环求和
    public static int sumUseFor(ArrayList sumArray){
        int sum = 0;
        for (int i = 0; i < sumArray.size(); i++) {
            sum=sum + (int)sumArray.get(i);
        }
        return sum;
    }


    //使用递归求和
    public static int sumUseRecursion(int n){
       if(n<=1){
           return 1;
       }else{
           return sumUseRecursion(n-1)+n;
       }
    }

    //使用递归求乘积
    public static int multiUseRecursion(int n){
       if(n<=1){
           return 1;
       }else{
           return multiUseRecursion(n-1)*n;
       }
    }




}
