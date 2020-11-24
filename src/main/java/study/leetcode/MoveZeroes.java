package study.leetcode;

/*  Given an array nums, write a function to move all 0's to the end of it
            while maintaining the relative order of the non-zero elements.*/

import java.util.Arrays;

/* Example:
Input: [0,1,0,3,12]
Output: [1,3,12,0,0]

 Note:You must do this in-place without making a copy of the array.
    Minimize the total number of operations.*/
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        if (null == nums || nums.length <= 0) {
            return;
        }
        int index = 0;
        for (int num : nums) {
            if (num != 0 ) {
                nums[index++] = num;
            }
        }
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }

    public static void main(String[] args) {
        //System.out.println(Arrays.toString());
        new MoveZeroes().moveZeroes(new int[]{0, 0, 1});
    }
}
