package cn.yuyangyang.thread04;

public class RunnableMain {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();

        Thread thread1 = new Thread(myRunnable, "飞机");
        Thread thread2 = new Thread(myRunnable,"高铁");



        thread1.start();
        thread2.start();
    }
}
