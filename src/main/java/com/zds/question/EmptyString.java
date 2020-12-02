package com.zds.question;

/**
 * @author zhudongsheng
 * @Description: TODO
 * @date 2020/12/2 13:45
 */
public class EmptyString {
    public static void main(String[] args) {
        String pids = ",1,2,3";
//        String[] pids1 = pids.split(",");
//        for (String s : pids1) {
//            System.out.println("------------>" + s);
//        }

//      pids.replaceFirst(",",null);
      pids.replaceFirst(",","null");
        String[] pids1 = pids.split(",");
        for (String s : pids1) {
            System.out.println("------------>" + s);
        }


    }
}
