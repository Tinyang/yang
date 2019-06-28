package study.multiThread;

public class Test3 implements Runnable {

    public static int record;

    public Test3(){
        System.out.println("create a new object!");
        record++;
    }
    @Override
    public void run() {

        System.out.println(record + "running...");
        //Thread.yield();
        System.out.println(record + "running...");
        //Thread.yield();
        System.out.println(record + "running...");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Thread.yield();
        System.out.println(record + "closed");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000000 ; i++) {
            new Thread(new Test3()).start();
        }
        Thread thread = new Thread();
        //thread.getThreadGroup().
    }
}
