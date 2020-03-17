package study.Socket;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PooledDaytimeServer {

    public static final int PORT = 1313;

    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(50);
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            while (true) {
                Socket connection = serverSocket.accept();
                Callable<Void> task = new DayTimeTask(connection);
                pool.submit(task);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static class DayTimeTask implements Callable<Void> {

        private Socket connection;

        public DayTimeTask(Socket connection) {
            this.connection = connection;
        }

        @Override
        public Void call() {
            try {
                Writer out = new OutputStreamWriter(connection.getOutputStream());
                Date now = new Date();
                out.write(now.toString() + "\r\n");
                out.flush();
                System.out.println("finish response!!!");
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }
    }
}
