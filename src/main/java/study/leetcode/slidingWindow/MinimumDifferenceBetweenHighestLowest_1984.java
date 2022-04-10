package study.leetcode.slidingWindow;

import java.util.Arrays;

public class MinimumDifferenceBetweenHighestLowest_1984 {
    public int minimumDifference(int[] nums, int k) {
        if (k <= 1) {return 0;}
        //sort will change this problem into a sliding window problem
        Arrays.sort(nums);
        int leftIndex = 0;
        int rightIndex = k - 1;
        int countNum = nums[rightIndex] - nums[leftIndex];
        while (rightIndex < nums.length - 1) {
            rightIndex ++;
            leftIndex ++;
            if ((nums[rightIndex] - nums[leftIndex]) < countNum) {
                countNum = nums[rightIndex] - nums[leftIndex];
            }
        }
        return countNum;
    }

}
