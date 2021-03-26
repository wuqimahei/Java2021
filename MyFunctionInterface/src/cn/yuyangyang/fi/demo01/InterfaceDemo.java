package cn.yuyangyang.fi.demo01;

public class InterfaceDemo {

    public static void main(String[] args) {

        // 作为局部变量，直接使用lambda表达式进行赋值
        MyInterface my = () -> System.out.println("函数式接口");
        my.show();

    }
}
