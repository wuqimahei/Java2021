package cn.yuyangyang.fi.demo02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {
    public static void main(String[] args) {

        //构造使用场景
        // 定义集合
        ArrayList<String> array = new ArrayList<>();
        array.add("cccc");
        array.add("aa");
        array.add("b");
        array.add("ddd");
        System.out.println("排序前：" + array);
//        Collections.sort(array);

        Collections.sort(array, getComparator());
        System.out.println("排序后：" + array);


    }

    // 按照字符串长度排序
    private static Comparator<String> getComparator() {

        // 匿名内部类方式
//        return new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return s1.length() - s2.length();
//            }
//        };

        // lambda表达式
//        return(String s1,String s2) -> {
//            return s1.length() - s2.length();
//        };
        // 优化 lambda
        return(s1, s2) -> s1.length() - s2.length();
    }

}

