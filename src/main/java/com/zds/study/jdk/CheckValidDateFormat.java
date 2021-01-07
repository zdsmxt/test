package com.zds.study.jdk;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author zhudongsheng
 * @Description: TODO
 * @date 2021/1/7 17:22
 */
public class CheckValidDateFormat {

    private static boolean isValidDate(String str) {
        boolean convertSuccess = true;
        // 指定日期格式为四位年/两位月份/两位日期，注意yyyy/MM/dd区分大小写；
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            // 设置lenient为false.
            // 否则SimpleDateFormat会比较宽松地验证日期，比如2007/02/29会被接受，并转换成2007/03/01
            format.setLenient(false);
            format.parse(str);
        } catch (ParseException e) {
            // e.printStackTrace();
            // 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
            convertSuccess = false;
        }
        return convertSuccess;
    }

    public static void main(String[] args) {
        System.out.println(isValidDate("2020-10-11 23:59:59"));
        System.out.println(isValidDate("2020/10/11 23:59:59"));


    }

}
