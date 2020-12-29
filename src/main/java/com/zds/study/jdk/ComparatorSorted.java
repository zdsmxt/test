package com.zds.study.jdk;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author zhudongsheng
 * @Description: TODO
 * @date 2020/12/28 15:09
 */
public class ComparatorSorted {

    public static void main(String[] args) {


        ArrayList<Integer> ids = new ArrayList<>();
        ids.add(3);
        ids.add(8);
        ids.add(2);
        ids.add(9);
        ids.add(30);
        ids.add(7);

        ids.stream().sorted(Comparator.reverseOrder()).forEach(item->{
            System.out.println(item);
        });

    }
}
