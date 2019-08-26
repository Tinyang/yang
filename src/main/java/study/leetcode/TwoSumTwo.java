package study.leetcode;

public class TwoSumTwo {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int num1 = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                int num2 = numbers[j];
                if ((num1 + num2) == target) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return null;
    }
}
