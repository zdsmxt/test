package com.zds.study.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @author zhudongsheng
 * @Description: TODO
 * @date 2020/11/30 11:36
 */
public class TenantCode {

    public static String autoGenCode(String suffix){
        final String suf = suffix.toUpperCase(); //这是在生成的编码前加统一前缀
        //下面两行是获取系统时间，并将时间以"202001062309123"这种格式输出
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
//        simpleDateFormat.applyPattern("yyyyMMddHHmmssSSS");
//        simpleDateFormat.applyPattern("yyyyMMddHHmmss");
        simpleDateFormat.applyPattern("yyyyMMddHH");
        //下面是后缀加的随机数
        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random=new Random();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<6;i++){ //此处i<6意为在上面str字符串中随机取6位
            int number=random.nextInt(62);
            sb.append(str.charAt(number));
        }
        return (simpleDateFormat.format(new Date())+sb.toString()+suf);
    }

    public static void main(String[] args) {
        System.out.println(autoGenCode("tag"));
    }
}
