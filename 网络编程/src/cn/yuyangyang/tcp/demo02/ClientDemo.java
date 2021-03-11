package cn.yuyangyang.tcp.demo02;

import java.net.InetAddress;
import java.net.Socket;

/**
 * TCP 客户端发送数据
 */
public class ClientDemo {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket(InetAddress.getByName("192.168.31.86"), 10086);

        socket.getOutputStream().write("lxt".getBytes());
        // 接收服务端返回的数据
        byte[] bytes = new byte[1024];
        int len = socket.getInputStream().read(bytes);
        System.out.println("客户端：" + new String(bytes, 0, len));

        socket.close();
    }
}
