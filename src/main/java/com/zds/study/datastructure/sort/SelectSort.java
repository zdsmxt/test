package com.zds.study.datastructure.sort;


//选择排序 这里的排好序时从左往右升序排列 每次选出剩下的数里面的最小的 从右到左依次升序排序
//特点 从左往右递增找到第一小 第二小 第三小 第n小
public class SelectSort {
    public static void main(String[] args) {


//        int a = 2;
//        int b = 3;
//        //交换a和b
//        a=a^b;
//        b=a^b;
//        a=a^b;
//        System.out.println("a="+a+" b="+b);

        int arr[] = {1,32,23,6,5,2,89};
//        int[] ints = chooseSort(arr);
//        int[] ints = bubbleSort(arr);
        int[] ints = insertSort(arr);
//        int[] ints = insertSort1(arr);
//        int[] ints = insertSort2(arr);
//        int[] ints = insertOrder(arr);i

        for (int anInt : ints) {
            System.out.println(anInt);

        }


    }
    //定义好一个选择排序方法
    public static int [] chooseSort(int arr[]){
        //边界条件检查不要忘
        if (arr == null || arr.length < 2) {
            return null;
        }
        //遍历数组
        for (int i = 0; i < arr.length-1; i++) {
            //定义一个临时变量保存 外层第n次循环的 内存循环里面的 第n小的值的下标
            int nMinIndex = i;//第n小的临时变量定义写在外层循环
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    nMinIndex = j;
                }

            }
            //内层循环找最小 交换发生在外层循环
            swap(arr,i,nMinIndex);
        }
        return arr;
    }



    //定义好一个冒泡排序方法
    public static int [] bubbleSort(int arr[]){
        //边界条件检查不要忘
        if (arr == null || arr.length < 2) {
            return null;
        }
        int len = arr.length;
        //遍历数组 外层逆序遍历 因为是从右往左降序排序 每次吧最大的沉底
        for (int i = len; len>0; len--) {
            for (int j = 0; j <len-1; j++) {
                //如果靠前的数大于靠后的数 交换
                if(arr[j]>arr[j+1]){
                    //内层循环交换
                    swap(arr,j,j+1);
                }

            }

        }
        return arr;
    }


    //定义好一个插入排序方法
    public static int [] insertSort(int arr[]){
        //边界条件检查不要忘
        if (arr == null || arr.length < 2) {
            return null;
        }
        int len = arr.length;
        //遍历数组 外层升序序遍历 从1开始 因为是从左往右升序排序
        for (int i = 1; i<len; i++) {
            //内层循环每次都是外层循环到的第几个数往前到第一的位置的数排好序
//            for (int j =i; j >0/*&&arr[j]>arr[j+1]*/; j--) {
            for (int j =i; j >0&&arr[j]<arr[j-1]; j--) {
                //如果靠前的数大于靠后的数 交换
//                if(arr[j-1]>arr[j]){
                    //内层循环交换
                    swap(arr,j,j-1);
//                }

            }

        }
        return arr;
    }


    //定义好一个插入排序方法
    public static int [] insertSort1(int arr[]){
        //边界条件检查不要忘
        if (arr == null || arr.length < 2) {
            return null;
        }
        int len = arr.length;
        //遍历数组 外层升序序遍历 从1开始 因为是从左往右升序排序
        for (int i = 1; i<len; len++) {
            //内层循环每次都是外层循环到的第几个数往前到第一的位置的数排好序
            for (int j =i-1; j >=0; j--) {
                //如果靠前的数大于靠后的数 交换
                if(arr[j-1]>arr[j]){
                //内层循环交换
                swap(arr,j,j-1);
                }
            }
        }
        return arr;
    }


    //定义好一个插入排序方法
    public static int [] insertSort2(int arr[]){
        //边界条件检查不要忘
        if (arr == null || arr.length < 2) {
            return null;
        }
        int len = arr.length;
        //遍历数组 外层升序序遍历 从1开始 因为是从左往右升序排序
        for (int i = 1; i<len; len++) {
            //内层循环每次都是外层循环到的第几个数往前到第一的位置的数排好序
            int temp = arr [i];
//            for (int j =i-1; j >=0; j--) {
            for (int j =i; j >=0; j--) {
                if(arr[j-1]>temp){
                    arr [j] = arr [j-1];//将排好序的部分 右移给新的值留空间
                }
             //将需要插入的数放入对应的位置
                arr[j] = temp;
            }
        }
        return arr;
    }

    //定义交换方法 作为一个小技巧
    public static void swap(int arr[] ,int a,int b){
        arr[a]= arr[a]^arr[b];
        arr[b]= arr[a]^arr[b];
        arr[a]= arr[a]^arr[b];

        //临时变量法 交换两个变量  两瓶水交换 借用第三个空瓶
//        int temp = arr [a];
//        arr [a] = arr [b];
//        arr [b] = temp;
//
        }



        public static int[] insertOrder(int [] unsorted){

            //外层循环 先假定第一个数字默认有序
            for (int i = 1; i < unsorted.length; i++) {
                //如果待插入的值小于前面的值
                if (unsorted[i - 1] > unsorted[i]) {
                    //将待插入的值 用临时变量保存
                    int temp = unsorted[i];
                    int j;
                    //内层遍历之前排好序的队列 逆序一直往前遍历 如果遍历到的这个有序队列
                    // 当前的值大于后面的待插入的值 则依次把这个有序队列的大于这个待插入的值依次后移
                    for (j = i - 1; j >= 0 && unsorted[j] > temp; j--) {
                        unsorted[j + 1] = unsorted[j];
                    }
                    //内层循环结束后 就会找到这个待插入值的位置
                    unsorted[j + 1] = temp;
                }
            }
            return unsorted;
        }

}
