package study.leetcode;

/*
Given an array, rotate the array to the right by k steps, where k is non-negative.
Follow up:
Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
Could you do it in-place with O(1) extra space?

Example 1:
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Example 2:
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]

Constraints:
1 <= nums.length <= 2 * 10^4
It's guaranteed that nums[i] fits in a 32 bit-signed integer.
k >= 0
*/


import java.util.HashMap;
import java.util.Map;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int newIndex = -1;
        int temp = 0;
        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            if (count < k) {
                newIndex = i + nums.length - k - 1;
                count++;
            }else {
                newIndex = temp;
                temp++;
            }
            map.put(newIndex,nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = map.get(i);
        }
    }

    public static void main(String[] args) {
        //int[] nums = {-1,-100,3,99};
        //new RotateArray().rotate(nums,2);

        int[] nums = {1,2,3,4,5,6,7};
        new RotateArray().rotate(nums,3);
    }

}
