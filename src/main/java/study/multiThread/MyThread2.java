package study.multiThread;

public class MyThread2 implements Runnable {
    int number;
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            synchronized (this) {
                number++;
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread2 runnable = new MyThread2();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
        Thread.sleep(7000);
        System.out.println(runnable.number);
    }
}
