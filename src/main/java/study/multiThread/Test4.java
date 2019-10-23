package study.multiThread;

import java.net.Socket;

public class Test4 {

    public static class MyRunnable implements Runnable{

        @Override
        public void run() {
            System.out.println("test2");
        }
    }

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("test");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        Thread thread1 = new Thread(new MyRunnable());
        thread1.start();

        Socket socket = new Socket();

    }
}
