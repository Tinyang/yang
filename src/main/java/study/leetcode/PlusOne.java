package study.leetcode;

import java.util.Arrays;

/**
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
 * <p>
 * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
 * <p>
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 * <p>
 * Example 1:
 * <p>
 * Input: [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Example 2:
 * <p>
 * Input: [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 */
public class PlusOne {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9){
                digits[i] = digits[i] + 1;
                return digits;
            }
            digits[i] = 0;
            if (i == 0){
                int[] array = new int[digits.length + 1];
                array[0] = 1;
                return array;
            }

        }
        return digits;
    }



    public static void main(String[] args) {
        //int[] array = {1,2,3};
        //int[] array = {9,8,7,6,5,4,3,2,1,0};
        //int[] array = {9};
        int[] array = {1};
        //plusOne(array);
        System.out.println(Arrays.toString(plusOne(array)));
    }

}
