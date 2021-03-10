package cn.yuyangyang.udp;


import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * UDP 接收数据
 */
public class ReceiveMsgDemo {
    public static void main(String[] args) throws Exception {

        // 接收端对象
        DatagramSocket ds = new DatagramSocket(2333);

        // 创建数据包用于接收数据
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        // 接收数据
        ds.receive(dp);

        // 解析数据包并打印
        byte[] datas = dp.getData();
        String dataString = new String(datas);
        System.out.printf("UDP接收到的数据是：" + dataString);

        // 关闭接收端
        ds.close();


    }
}
