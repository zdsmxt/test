package com.zds.study.datastructure.halfdivide;


//使用二分查找指定的值 在一个有序的数组中
public class UseTwoDivideFindAssignValueInOrderArray {

    public static void main(String[] args) {

        int a []= {1,2,3,4,5,6,7,9};
//        boolean index = findAssignValueExist(a, 9);
//        System.out.println(index);
//
//        System.out.println("======");

        int index1 = findAssignValue(a, 8);
        int index2 = findAssignValue1(a, 9);
        System.out.println(index1);
        System.out.println(index2);

    }

//    public static int findAssignValue(int arr[],int v){
    public static boolean findAssignValueExist(int arr[],int v){
        if(arr==null){
            return false;
        }
        int l=0;
        int r=arr.length-1;
        int mid=0;
        while (l<=r){

            mid= l+((r-l)>>>1);
            if(arr[mid]==v){
//                return mid;
                return true;
            }else if(arr[mid]>v){//如果输入的值小于中间的值说明 应该继续往左找
                r=mid-1;

            }else{//如果输入的值小于中间的值说明 应该继续往左找
                l=mid+1;

            }
        }

        return arr[l]==v;
    }


    public static int findAssignValue(int arr[],int v){
            if(arr==null){
                return -1;
            }
            int l=0;
            int r=arr.length-1;
            int mid=0;
            while (l<r){ // 只要while 里面的三个多路分支 大于小于等于 根中间值比较
                mid= l+((r-l)>>>1);
                if(arr[mid]==v){
                return mid+1;
                }else if(arr[mid]>v){//如果输入的值小于中间的值说明 应该继续往左找
                    r=mid-1;

                }else{//如果输入的值小于中间的值说明 应该继续往左找
                    l=mid+1;

                }
            }
            return -1;
        }



    public static int findAssignValue1(int arr[],int v){
        if(arr==null){
            return -1;
        }
        int l=0;
        int r=arr.length-1;
        int mid=0;
        while (l<=r){
            mid= l+((r-l)>>>1);
            if(v==arr[mid]){
                return mid+1;
            }
            if(v<arr[mid]){//如果输入的值小于中间的值说明 应该继续往左找
                r=mid-1;

            }
            if(v>arr[mid]){//如果输入的值大于于中间的值说明 应该继续往右找
                l=mid+1;

            }
        }
        return -1;
    }


}
