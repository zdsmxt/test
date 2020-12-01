package com.zds.study.utils;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * @author zhudongsheng
 * @Description: TODO
 * @date 2020/11/30 11:24
 */
public class CodeUtil {

    private static final String[] CHARS = new String[] {"1", "2", "3", "4", "5",
            "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H",
            "J", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "U", "V",
            "W", "X", "Y", "Z" };

    /**
     * 生成随机码
     * @param bit
     * @return
     */
    public static String generateRandomString(int bit){
        StringBuffer sb = new StringBuffer();
        Random r = new Random();
        for(int i=0; i<bit; i++){
            int num = r.nextInt(CHARS.length);
            sb.append(CHARS[num]);
        }
        return sb.toString();
    }

//    public static void main(String[] args) {
//        // if bit = 8   2,821,109,907,456  是会有2万亿个code 码的
//        System.out.println(generateRandomString(8));
//    }

//
//    public static void main(String[] args) {
//        Integer i = 30000000;
//
//        for (int j = 0; j < args.length; j++) {
//            String arg = args[j];
//
//        }
//    }


    // for test
    public static void main(String[] args) {
        Integer testTime = 5000000;
       List<String> strings1 = new LinkedList<String>();
       List<String> strings2 = new LinkedList<String>();

        for (int i = 0; i <testTime; i++) {
            strings1.add(generateRandomString(8));
            strings2.add(generateRandomString(8));
        }
        for (int i = 0; i < testTime; i++) {
            for (int j = 0; j < testTime; j++) {
                if(strings1.get(i).equals(strings2.get(j))){
                    System.out.println("----------->"+j);
                }
            }
        }
    }

}
