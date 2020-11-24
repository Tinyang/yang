package study.multiThread;

public class MyThread extends Thread {
    @Override
    public void run() {
        mockCalculate();
    }

    public void mockCalculate()  {
        try {
            for (int i = 0; i < 100; i++) {
                System.out.println("MyThread.mockCalculate " + i + " " + Thread.currentThread().getName());
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Thread thread1 = new MyThread();
        Thread thread2 = new MyThread();
        thread1.start();
        thread2.start();
    }
}
