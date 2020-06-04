package com.zds.study.datastructure.sort;
//插入排序
//demo 54321
//54321 45321               i=1
//45321 43521 34521         i=2
//34251 32451 23451         i=3
//23415 23145 21345 12345
public class InsertSort {
    public static void main(String[] args) {
        int[] intArray = {5,4,3,2,1};
        int[] ints = insertSort(intArray);
        for (int i : ints) {
            System.out.println(i);
        }
    }
    public static int[] insertSort(int[]intArray){
        int temp = 0;
        for (int i = 1; i < intArray.length; i++) {
            for (int j = i; j > 0; j--) {
                if(intArray [j]<intArray [j-1]){
                    temp = intArray [j];
                    intArray [j]= intArray [j-1];
                    intArray [j-1] = temp;
                }
            }
        }
        return intArray;
    }
}
