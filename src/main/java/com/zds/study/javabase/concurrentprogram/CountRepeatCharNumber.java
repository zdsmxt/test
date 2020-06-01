package com.zds.study.javabase.concurrentprogram;

import java.util.ArrayList;
import java.util.HashMap;

// 统计一个字符串里面的重复的字符数字
public class CountRepeatCharNumber {

    public static void main(String[] args) {
        String demo = "abaabccddff";
        char[] chars = demo.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (Character aChar : chars) {

            if(hashMap.containsKey(aChar)){
                Integer count = hashMap.get(aChar);
                hashMap.put(aChar,count+1);
            }else{
                hashMap.put(aChar,1);
            }
        }

        for (Character character : hashMap.keySet()) {
            System.out.println(character+"---"+hashMap.get(character));
        }

    }
}
