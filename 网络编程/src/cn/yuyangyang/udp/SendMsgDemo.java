package cn.yuyangyang.udp;

import java.io.IOException;
import java.net.*;

/**
 * UDP协议发送
 */
public class SendMsgDemo {
    public static void main(String[] args) throws IOException {
        // 创建发送端Socket对象 DatagramSocket
        DatagramSocket datagramSocket = new DatagramSocket();

        // 创造数据
        byte[] bytes = "lxtiiiitttttyyy".getBytes(); // 数据
        int length = bytes.length;  //数据长度
        InetAddress address = InetAddress.getByName("192.168.31.86");  //发送到的ip
        int port = 2333;  //端口
        // 创建数据包
        DatagramPacket datagramPacket = new DatagramPacket(bytes, length, address, port);
        // 发送数据

        datagramSocket.send(datagramPacket);
        // 关闭发送端
        datagramSocket.close();
    }

}
