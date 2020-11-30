package com.zds.study.utils;

import java.util.Random;
import java.util.UUID;

/**
 * @author zhudongsheng
 * @Description: TODO
 * @date 2020/11/30 10:54
 */
public class UUIDUtils {
    public static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "")+ UUID.randomUUID().toString().replace("-","");
    }

    public static String findkeyUtil() {
        String str="ABCDEFGHIJKLMNOPQRSTUVWXYZqwertyuiopasdfghjklzxcvbnm0123456789";
        StringBuilder st=new StringBuilder(4);
        for(int i=0;i<4;i++){
            char ch=str.charAt(new Random().nextInt(str.length()));
            st.append(ch);
        }
        String findkey=st.toString().toLowerCase();
        System.out.println("生成找回的key为："+st.toString());
        return findkey;
    }

    public static void main(String[] args) {
//        System.out.println(getUUID());

        String ss = "1234567890123";
        ss.codePointCount(3,9);
        System.out.println(ss);

    }

}
