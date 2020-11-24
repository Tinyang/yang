package study.multiThread;

public class MyThread3 extends Thread {

    CalculateNumber calculateNumber;

    @Override
    public void run() {
        mockCalculate();
    }

    public void mockCalculate()  {
        for (int i = 0; i < 100; i++) {
            synchronized (calculateNumber) {
                calculateNumber.add();
            }
        }
        System.out.println(Thread.currentThread().getName());
    }

    public MyThread3(CalculateNumber calculateNumber) {
        //super();
        this.calculateNumber = calculateNumber;
    }

    public static void main(String[] args) throws InterruptedException {
        CalculateNumber calculateNumber = new CalculateNumber();
        Thread thread1 = new MyThread3(calculateNumber);
        Thread thread2 = new MyThread3(calculateNumber);
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(1000);
        thread1.start();
        thread2.start();
        System.out.println(calculateNumber.getI());
    }
}
