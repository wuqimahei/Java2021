package cn.yuyangyang.stream_demo_01;

import java.util.ArrayList;

public class Demo01 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("刘大同");
        array.add("林青霞");
        array.add("张敏");
        array.add("张三三");
        array.add("张无忌");
        array.add("王祖霞");

        // 所有姓张的集合
        ArrayList<String> zhangList = new ArrayList<>();
        for (String s : array) {
            if (s.startsWith("张")){
                zhangList.add(s);
            }
        }
        System.out.println(zhangList);

        // "张"开头，长度为三
        ArrayList<String> threeList = new ArrayList<>();
        for (String s : zhangList){
            if (s.length() == 3){
                threeList.add(s);
            }
        }
        System.out.println(threeList);
        // 遍历集合
        for (String name:threeList){
            System.out.println(name);
        }
        System.out.println("====================");

        // 采用Stream流
        array.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(s -> System.out.println(s));
        System.out.println("====================");
        // 更简洁
        array.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(System.out::println);
    }
}
