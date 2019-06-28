package study.netty;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class NewSocketTest {
    public static void main(String[] args) {
        Socket socket = new Socket();
        //socket.getKeepAlive();
        socket.isClosed();

        try {
            ServerSocket serverSocket = new ServerSocket(444);
            //serverSocket
            serverSocket.isClosed();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
