package study.leetcode;

public class Fibonacci {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int fibonacci2(int n) {
        int[] array = new int[n + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = -1;
        }
        array[0] = 1;
        array[1] = 1;
        return getFibonacciNum(n, array);

    }

    private static int getFibonacciNum(int n, int[] array) {
        if (array[n] != -1) {
            return array[n];
        } else {
            return array[n] = getFibonacciNum(n - 1, array) + getFibonacciNum(n - 2, array);
        }
    }

    public static int fibonacci3(int n) {
        int num = 0;
        int temp1 = 1;
        int temp2 = 1;
        if (n <= 1) {
            return 1;
        } else {
            for (int i = 2; i <= n; i++){
                num = temp1 + temp2;
                temp1 = temp2;
                temp2 = num;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        //System.out.println(fibonacci3(5));
        for (int i = 0; i < 100 ; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(fibonacci(10));
                }
            }).start();
        }

    }
}
