package cn.yuyangyang.thread01;

public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println(i);
        }
    }
}
