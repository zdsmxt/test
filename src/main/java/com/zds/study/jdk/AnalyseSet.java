package com.zds.study.jdk;

import java.util.HashMap;
import java.util.HashSet;

//分析 set
public class AnalyseSet {
    public static void main(String[] args) {
//        HashSet<String> strings = new HashSet<>();
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("1","a");
        hashMap.put("2","b");
        hashMap.put("3","c");
        hashMap.put("4","d");
        hashMap.put("5","e");
        hashMap.put("6","f");

        for (String s : hashMap.keySet()) {
            System.out.println(s+"===="+hashMap.get(s));
        }

    }
}
