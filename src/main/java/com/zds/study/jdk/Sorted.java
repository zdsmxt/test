package com.zds.study.jdk;

import java.util.ArrayList;

/**
 * @author zhudongsheng
 * @Description: TODO
 * @date 2020/12/25 15:01
 */
public class Sorted {

    public static void main(String[] args) {
//        ArrayList<Integer> monthList = new ArrayList<>();
//        monthList.add(202012);
//        monthList.add(202011);
//        monthList.add(201912);
//        monthList.add(202010);
//        monthList.add(202009);
//        monthList.add(202004);
//        monthList.add(202007);
//        monthList.add(202003);
//        monthList.add(202002);
//        monthList.stream().sorted().forEach(item->{
//            System.out.println(item);
//        });

        ArrayList<String> mlist = new ArrayList<>();
        mlist.add("202012");
        mlist.add("202010");
        mlist.add("202011");
        mlist.add("202008");
        mlist.add("202009");
        mlist.add("202003");
        mlist.add("202004");
//        mlist.stream().sorted().forEach(item->{
//            System.out.println(item);
//        });


        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(10);
        arrayList.add(11);
        arrayList.add(12);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(9);
        arrayList.stream().sorted().forEach(item->{
            System.out.println(item);
        });
    }

}
