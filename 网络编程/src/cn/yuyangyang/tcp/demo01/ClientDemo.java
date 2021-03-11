package cn.yuyangyang.tcp.demo01;

import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * TCP 客户端发送数据
 */
public class ClientDemo {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket(InetAddress.getByName("192.168.31.86"), 10086);

        socket.getOutputStream().write("lxt".getBytes());

        socket.close();
    }
}
