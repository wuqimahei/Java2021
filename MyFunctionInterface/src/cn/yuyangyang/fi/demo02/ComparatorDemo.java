package cn.yuyangyang.fi.demo02;

import java.util.Comparator;

public class ComparatorDemo {
    public static void main(String[] args) {

    }


    private static void getComparator() {
        // 匿名内部类方式
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        };
    }

}

