package cn.yuyangyang.lambda01;

public class LambdaDemo {
    public static void main(String[] args) {

        useEatable(() ->{
            System.out.println("lambda输出的");
        });
    }

    private static void useEatable(Eatable e){
        e.eat();
    }
}
