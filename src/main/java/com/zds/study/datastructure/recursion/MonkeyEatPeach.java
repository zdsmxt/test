package com.zds.study.datastructure.recursion;


// 猴子吃桃问题的递归实现
//猴子吃桃问题：猴子第一天摘下若干个桃子，
// 当即吃了一半，还不过瘾，又多吃了一个，
// 第二天早上又将剩下的桃子吃掉一半，又多吃了一个。
// 以后每天早上都吃了前一天剩下的一半零一个。
// 到第10天早上想再吃时，见只剩下一个桃子了。
// 要求输入n(1<=n<=10）,输出第n天有多少个桃子；
public class MonkeyEatPeach {
    public static void main(String[] args) {
        System.out.println(monkeyEatPeachUseRecursion(9));
        System.out.println(monkeyEatPeachUseFor(9));
    }

    public static int monkeyEatPeachUseRecursion(int day){
        if(day ==10){
            return 1;
        }else{
            return(monkeyEatPeachUseRecursion(day+1)+1)*2;
        }
    }
    public static int monkeyEatPeachUseFor(int appointDay) {
        int sum=0,remain=1;
        for (int day = 9; day >= 1; day--) {
            sum = (remain+1)*2;
            remain = sum;
            if(appointDay==day){
                return remain;
            }
        }
        return remain;
    }
}
