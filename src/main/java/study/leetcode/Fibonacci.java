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
        return getFionacciNum(n, array);

    }

    private static int getFionacciNum(int n, int[] array) {
        if (array[n] != -1) {
            return array[n];
        } else {
            return array[n] = getFionacciNum(n - 1, array) + getFionacciNum(n - 2, array);
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
        if (false)
            System.out.println("test1111");
            System.out.println("test2222");

    }
}
