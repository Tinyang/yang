package study.leetcode;

/*
Given a binary array, find the maximum number of consecutive 1s in this array.
Example 1:
Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
The maximum number of consecutive 1s is 3.
Note:
The input array will only contain 0 and 1.
The length of input array is a positive integer and will not exceed 10,000*/

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int lastNumLength = 0;
        int currentNumLength = 0;
        int lastNum = nums[0];
        for (int num: nums) {
            if (num == lastNum) {
                lastNumLength ++;
            } else {
                lastNum = num;
                lastNumLength = Math.max(lastNumLength, currentNumLength);
                currentNumLength = 0;
                currentNumLength ++;
            }
        }
       return Math.max(lastNumLength, currentNumLength);
    }

    public int findMaxConsecutiveOnes2(int[] nums) {
        int lastNumLength = 0;
        int currentNumLength = 0;
        int lastNum = nums[0];
        for (int num: nums) {
            if (num == lastNum && num == 1) {
                lastNumLength ++;
            } else if (num != lastNum && num == 1) {
                lastNum = num;
                lastNumLength = Math.max(lastNumLength, currentNumLength);
                currentNumLength = 0;
                currentNumLength ++;
            } else {
                lastNum = 0;
            }
        }
        return Math.max(lastNumLength, currentNumLength);
    }

}
