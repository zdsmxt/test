package com.zds.study.datastructure.search;

import java.util.ArrayList;
import java.util.List;

// 二分 折半查找
public class HalfSearch {

    public static void main(String[] args) {
        // 准备好一个有序数组
        int orderArray[] = {1,2,3,4,5,5,6,6,7};
        System.out.println(halfSearch(orderArray,5));
        System.out.println(halfFindUseRecursion(orderArray,0,orderArray.length,7));
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < orderArray.length; i++) {
            arrayList.add(orderArray[i]);

        }
        System.out.println("================================");
        System.out.println(halfFindRecursion(arrayList,0,arrayList.size(),8));
        System.out.println(halfFindRecursion(arrayList,0,arrayList.size(),5));

    }

    //普通for 循环查找  返回要查的值的下标
    public static int halfSearch(int[]orderArray,int findedValue){
        //定义最低位最左端和最高位最右端
        int low=0;
        int high=orderArray.length-1;
        //在确保所分的区最左边的值小于等于最右边 进行循环
        while(low<=high){
            // 去这个段中间元素的值进行比较
            int mid = (low + high)>>1;
            if(orderArray[mid]<findedValue){ //如果传入的值 大于中间值则 说明待查的值 在这个数组中间值的右端 最小值=中间下标加一
                low = mid + 1;
            }else if(orderArray[mid]>findedValue){//如果传入的值 小于于中间值则 说明待查的值 在这个数组中间值的左端 最大值=中间下标减一
                high = mid -1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    //二分查找的递归实现
    public static int halfFindRecursion(List arr, int low, int high, int findValue){
        if(arr==null||arr.isEmpty() || !arr.contains(findValue)){
            return -1;
        }
        if(low<=high){
        int mid = (low + high)>>1;
            if(findValue==(int)arr.get(mid)){
                return mid;
            }else if(findValue > (int)arr.get(mid)){
                    return halfFindRecursion(arr,mid+1,high,findValue);
            }else{
                    return halfFindRecursion(arr,low,mid-1,findValue);
            }
        }else{
            return -1;
        }
    }

    //二分查找的递归实现
    public static int halfFindUseRecursion(int[]arr,int low,int high,int findValue){
        // 这个代码有问题 假如传入的值 排好序的数组里面没有这个值
        if(arr==null){
            return -1;
        }
        if(low<=high){
            int mid = (low + high)>>1;
            if(findValue==arr[mid]){
                return mid;
            }else if(findValue > arr [mid]){
                return halfFindUseRecursion(arr,mid+1,high,findValue);
            }else{
                return halfFindUseRecursion(arr,low,mid-1,findValue);
            }
        }else{
            return -1;
        }
    }




}
