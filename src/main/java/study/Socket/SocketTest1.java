package study.Socket;

import java.io.IOException;
import java.net.Socket;

public  class SocketTest1 {

    public static void main(String[] args) {
        String host = "www.google.com";
        //for (int i = 0; i < 1024; i++) {
            try {
                //Socket socket = new Socket(host,i);
                Socket socket = new Socket(host,80);
                System.out.println("there is a server on port");
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (Exception e) {

            }
        //}

    }


    private static class SocketTest2{

    }
}

