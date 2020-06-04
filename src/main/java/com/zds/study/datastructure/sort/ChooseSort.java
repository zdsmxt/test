package com.zds.study.datastructure.sort;
//选择排序
//54321
// index=0 j=1 index=1  j=2 index=2 j=3 index=3 j=4 index=4
// 0与4 交换14325
// index=1 j=2 index=2  j=3 index=3 j=4 index=3
public class ChooseSort {
    public static void main(String[] args) {
        int[] intArray = {5,4,3,2,1};
        int[] ints = chooseSort(intArray);
        for (int i : ints) {
            System.out.println(i);
        }
    }
    public static int[] chooseSort(int[]intArray){
        int i,j,min ; //利用下标的力量
        for (i = 0; i < intArray.length; i++) {
            min=i;//随着外层循环 顺序拿到数组里面的下标对应的值
            for (j = i+1; j <intArray.length; j++) {
                // 拿这个数组 剩余的intArray.length -i 个元素
                if(intArray [j]<intArray [min]){
                    min = j;
                }
            }
            System.out.println("第"+i+"次排序里面的最小值"+intArray[min]);
            int temp = intArray [i];
            intArray [i]= intArray [min];
            intArray [min] = temp;
        }
        return intArray;
    }
}
