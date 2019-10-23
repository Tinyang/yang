package study.multiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(123);
            }
        });
        executorService.shutdown();
    }
}
