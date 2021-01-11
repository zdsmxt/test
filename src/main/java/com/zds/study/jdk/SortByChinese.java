package com.zds.study.jdk;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author zhudongsheng
 * @Description: TODO
 * @date 2020/12/31 10:13
 */
public class SortByChinese {

    public static void main(String[] args) {
        // Collator 类是用来执行区分语言环境的 String 比较的，这里选择使用CHINA
        Comparator cmp = Collator.getInstance(java.util.Locale.CHINA);
        ArrayList stringList = new ArrayList<String>() {{
//            add("优秀");
//            add("厉害");
//            add("爱了");
            add("刘厚磊");
            add("王明玉");
            add("郭俊雅");
            add("董文剑");
            add("沈程");
            add("张玉博");
            add("王维仲");
            add("朱东升");
        }};
        stringList.stream().sorted(cmp).forEach(
//        stringList.stream().sorted().forEach(
                item -> {
                    System.out.println(item);
                }
        );

    }
}
