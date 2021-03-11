package cn.yuyangyang.udp.通讯程序;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * UDP协议发送键盘录入数据，直到键盘输入886 结束程序
 */
public class SendMsgDemo {
    public static void main(String[] args) throws IOException {
        // 创建发送端Socket对象 DatagramSocket
        DatagramSocket ds = new DatagramSocket();

        // 创造数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line=br.readLine()) !=null){
            // 如果输入的是886 则退出程序
            if ("886".equals(line)){
                break;
            }
            // 否则 创建数据包 发送数据
            DatagramPacket dp = new DatagramPacket(line.getBytes(), line.length(), InetAddress.getByName("192.168.31.86"),2333);
            // 发送数据
            ds.send(dp);
        }

        // 关闭发送端
        ds.close();
    }

}
