package cn.yuyangyang.fi.demo01;

@FunctionalInterface //有这个注解表明这是一个函数式接口，如果写第二个抽象方法就会编译失败
public interface MyInterface {
    void show();
}
