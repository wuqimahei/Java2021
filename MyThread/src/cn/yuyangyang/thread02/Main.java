package cn.yuyangyang.thread02;

public class Main {

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("线程 0");
        t2.setName("线程 1");
        t1.start();
        t2.start();


    }
}
