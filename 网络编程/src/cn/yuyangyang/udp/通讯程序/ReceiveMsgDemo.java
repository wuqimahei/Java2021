package cn.yuyangyang.udp.通讯程序;


import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * UDP 接收数据
 */
public class ReceiveMsgDemo {
    public static void main(String[] args) throws Exception {

        // 接收端对象
        DatagramSocket ds = new DatagramSocket(2333);

        while (true){
            // 创建数据包用于接收数据
            byte[] bytes = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

            // 接收数据
            ds.receive(dp);

            // 解析数据包并打印
            System.out.println("UDP接收到的数据是：" + new String(dp.getData(),0,dp.getLength()));
        }


//        // 关闭接收端
//        ds.close();


    }
}
