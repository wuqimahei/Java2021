package cn.yuyangyang.fi.demo02;

public class RunnableDemo {
    public static void main(String[] args) {

        // 匿名内部类方式调用-不推荐
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "线程启动");
            }
        });

        // lambda方式调用（形参是函数式接口，可以通过lambda作为实参传递）
        startThread(() -> System.out.println(Thread.currentThread().getName() + "线程启动"));


    }

    // runnable接口是一个函数式接口，函数式接口可作为形参
    private static void startThread(Runnable runnable) {

//        Thread thread = new Thread(runnable);
//        thread.start();
        new Thread(runnable).start();
    }
}
