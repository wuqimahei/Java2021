package cn.yuyangyang.thread03;

public class Main {

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.setName("高铁");
        t2.setName("飞机");
        t3.setName("汽车");

        // 获取线程优先级
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());

        // 1-10之间的整数
        t1.setPriority(8);
        t2.setPriority(10);
        t3.setPriority(1);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());

        t1.start();
        t2.start();
        t3.start();


    }
}
