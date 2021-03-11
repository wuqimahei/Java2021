package cn.yuyangyang.tcp.demo02;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP 服务器端对象
 */
public class ServerDemo {

    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(10086);

        byte[] bytes = new byte[1024];

        Socket socket = serverSocket.accept();

        int len = socket.getInputStream().read(bytes);

        System.out.println("TCP服务端：" + new String(bytes, 0, len));
        // 接收到后回复一句
        socket.getOutputStream().write("收到啦".getBytes());

        serverSocket.close();
    }
}
