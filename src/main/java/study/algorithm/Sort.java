package study.algorithm;

import java.util.Arrays;

public class Sort {

    void test() {

    }

    private static class ChildSort {
        int i = 1;
        public void haha() {}

    }


    public void bubbleSortFromMaxToMin(int[] array) {
        if (null == array || array.length <= 0) {
            return;
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int temp = array[j];
                if (array[i] < temp) {
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {

        new ChildSort().haha();

        int[] array = {3,4,1,5,7,9,21};
        System.out.println(Arrays.toString(array));
        new Sort().bubbleSortFromMaxToMin(array);
        System.out.println(Arrays.toString(array));
    }
}
