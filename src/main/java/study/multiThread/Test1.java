package study.multiThread;

public class Test1 implements Runnable {
    @Override
    public void run() {
        System.out.println("123");
        /*try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        System.out.println("456");
    }


    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                new Test1().run();
            }
        }).start();
    }
}
