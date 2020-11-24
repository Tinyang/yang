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
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws InterruptedException {
        if (3 > 1) {
            System.out.println("Test1.main11111");
        }else if (3 > 2) {
            System.out.println("Test1.main2222");
        }
    }
}
