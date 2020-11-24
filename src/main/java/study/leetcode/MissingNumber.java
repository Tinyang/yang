package study.leetcode;

import java.util.Arrays;

/*Given an array containing n distinct numbers taken from 0, 1, 2, ..., n,
        find the one that is missing from the array.*/
/*Example 1:

Input: [3,0,1]
Output: 2

Example 2:
Input: [9,6,4,2,3,5,7,0,1]
Output: 8*/
public class MissingNumber {

    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int temp = nums[0];
        for (int i = 0; i < nums.length; i++){
            if ((nums[i] - i) != temp) {
                return nums[i] - 1;
            }
        }
        return temp - 1 < 0 ? temp + 1 : temp - 1;
    }

    public static void main(String[] args) {
        //int[] arrray = {3,0,1};
        int[] arrray = {9,6,4,2,3,5,7,0,1};
        System.out.println(new MissingNumber().missingNumber(arrray));

        System.out.println(22 ^ 23 ^ 23);
    }
}
