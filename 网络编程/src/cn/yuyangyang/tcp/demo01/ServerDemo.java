package cn.yuyangyang.tcp.demo01;

import java.io.IOException;
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

        serverSocket.close();
    }
}
