package com.zds.study.datastructure.search;

// 顺序查找 最简单的查找方式
public class SequenceSearch {
    public static void main(String[] args) {
        int[] intArray = {5,4,3,2,1};
        System.out.println(sequenceSearch(intArray,3));

    }
    public static int sequenceSearch(int []array,int a){
        int i;
        for (i = 0; i < array.length; i++) {
          if(array[i]==a){
              return i;
          }
//          else{
//              break;
//          }

//            else{
//                continue;
//            }
        }
        return -1;
    }
}
