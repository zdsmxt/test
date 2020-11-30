package com.zds.study.utils;

import java.text.SimpleDateFormat;
import java.util.Random;

/**
 * @author zhudongsheng
 * @Description: TODO
 * @date 2020/11/30 11:49
 */
public class CodeGeUtil {
    private static final String[] CHARS = new String[] {"1", "2", "3", "4", "5",
            "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H",
            "J", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "U", "V",
            "W", "X", "Y", "Z" };

    /**
     * 生成随机码
     * @param bit
     * @return
     */
    public static String generateRandomString(int bit,String suffix){
        StringBuffer sb = new StringBuffer();
        Random r = new Random();
        for(int i=0; i<bit; i++){
            int num = r.nextInt(CHARS.length);
            sb.append(CHARS[num]);
        }
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
//        simpleDateFormat.applyPattern("yyyyMMddHH");
//        sb.append(simpleDateFormat);
//        sb.append(suffix.toUpperCase());

        return sb.toString();
    }

    public static void main(String[] args) {
        // if bit = 8   208,827,064,576  是会有2000 亿个code 码的
        System.out.println(generateRandomString(6,"tag").toString());
    }

}
