package com.zds.study.datastructure.maxvalue;


//遍历找出一个数组的最大值
//递归求出一个数组的最大值
public class MaxValue {

    public static void main(String[] args) {
        int a[] = {1,2,34,56,3,100};
        System.out.println(maxValue(a));

//        System.out.println(recursionMaxValue(a,0,a.length-1));
        System.out.println(recursion(a,0,a.length-1));
    }

    public static int maxValue(int arr[]){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i+1<arr.length){
//                max = arr [i];
//                if(max>arr [i+1]){
//                    max = arr [i];
//                }else{
//                    max = arr [i+1];
//                }
               max = arr [i]>arr [i+1]?arr [i]:arr [i+1];
            }
        }

        return max;
    }

    public static int recursionMaxValue(int arr[],int left,int right){
        left = 0;
        right = arr.length -1;
        int mid =0;
        int l=0,r=0;
        while(left <= right){
           mid = left+((right - left)>>>1);
           if(arr [left]==arr [right]){
               return arr [left];
           }
            l= recursionMaxValue(arr,mid+1,right);
            r= recursionMaxValue(arr,left,mid-1);


        }
        return Math.max(l,r);
    }

    public static int recursion(int arr[],int left,int right){

            if(arr [left]==arr [right]){
                return arr [left];
            }
            int mid = left+((right - left)>>>1);
            int rmax= recursion(arr,mid+1,right);
//            int lmax= recursion(arr,left,mid-1);
            int lmax= recursion(arr,left,mid);


        return Math.max(lmax,rmax);
    }



}
