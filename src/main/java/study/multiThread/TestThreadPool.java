package study.multiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(5);
        es.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("test1");
            }
        });
        es.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("test2");
            }
        });
        es.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("test3");
            }
        });
        es.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("test4");
            }
        });
        es.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("test5");
            }
        });
        es.shutdown();
    }
}
