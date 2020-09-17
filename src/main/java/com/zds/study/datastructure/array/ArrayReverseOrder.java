package com.zds.study.datastructure.array;

//数组逆序
public class ArrayReverseOrder {

    public static void main(String[] args) {

        //准备好一个数组
        int arr [] = {1,2,3,4,5,6,7,8,9};
        int[] ints = reverseArray(arr);
        for (int anInt : ints) {
            System.out.print(anInt+" ");
        }
    }

    public static int[] reverseArray(int arr[]){
        int l=0;
        int r=arr.length-1;

        while (l <= r) {
         swap(arr,l,r);
         l++;
         r--;
        }

        return arr;

    }


    public static void swap(int arr[] ,int a,int b){
//        arr[a]= arr[a]^arr[b];
//        arr[b]= arr[a]^arr[b];
//        arr[a]= arr[a]^arr[b];


        int temp = arr [a];
        arr [a] = arr [b];
        arr [b] = temp;
    }

}
