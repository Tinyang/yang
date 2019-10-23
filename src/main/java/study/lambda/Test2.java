package study.lambda;

public class Test2 implements Runnable {
    @Override
    public void run() {
        int a = 6;
    }

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("123");
            }
        }).start();

        new Thread(() -> System.out.println("456")).start();

        new Test1((e) ->
        {
            System.out.println("456");
            return e;
        }
        );
        //new Thread(Test1::tt(a).start();
    }
}
