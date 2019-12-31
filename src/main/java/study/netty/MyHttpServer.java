package study.netty;

import java.io.IOException;
import java.net.ServerSocket;

public class MyHttpServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            while (true) {
                serverSocket.accept();
                System.out.println("MyHttpServer.main");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
