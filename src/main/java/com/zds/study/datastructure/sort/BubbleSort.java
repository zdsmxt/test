package com.zds.study.datastructure.sort;

//冒泡排序
// demo   5 4 3 2 1 降序变为升序排序
// 43215   <- 45321 43521 43251 43215
// 32145   <- 23145 21345 21345 21345
// 21345   <- 12345 12345 12345 12345
// 12345   <- 12345 12345 12345 12345
public class BubbleSort {

    public static void main(String[] args) {
        int[] intArray = {5,4,3,2,1};
        int[] ints = bubbleSort(intArray);

        for (int i : ints) {
            System.out.println(i);
        }

    }

    public static int[] bubbleSort(int[]intArray){

        int temp = 0;
        for (int i = 0; i < intArray.length-1; i++) {
//            for (int j = 0; j < intArray.length; j++) {
//            for (int j = 0; j < intArray.length-1; j++) {
            // 内层循环 为什么要减一 防止数组越界
            // 内层循环 为什么要减i  因为外层循环 每递进一次 就有一个数排好序
            for (int j = 0; j < intArray.length-1-i; j++) {
                if(intArray [j]>intArray [j+1]){
                    temp = intArray [j];
                    intArray [j]= intArray [j+1];
                    intArray [j+1] = temp;
                }

            }

        }
        return intArray;
    }
}
