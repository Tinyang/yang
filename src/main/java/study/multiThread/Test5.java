package study.multiThread;

public class Test5 {
    public static void main(String[] args) {
        TestStudent student = new TestStudent();
        student.setAge(10);
        for (int i = 0; i < 30000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    student.agePlus();
                    System.out.println("tread" + student.getAge());
                }
            }).start();
        }
        System.out.println(student.getAge());

    }
}
