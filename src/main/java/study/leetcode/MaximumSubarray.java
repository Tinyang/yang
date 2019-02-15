package study.leetcode;

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 * <p>
 * Example:
 * <p>
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * Follow up:
 * <p>
 * If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */
public class MaximumSubarray {

    /**
     * @param nums
     * @return
     */

    public static int maxSubArray(int[] nums) {
        if (null == nums || nums.length <= 0) {
            return 0;
        }
        int sum = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            int temp = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (temp >= sum) {
                    sum = temp;
                }
                temp += nums[j];
                if (temp >= sum) {
                    sum = temp;
                }
            }
        }
        return sum > nums[nums.length - 1] ? sum : nums[nums.length - 1];
    }

    public static int maxSubArray2(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int max_sofar = Integer.MIN_VALUE, max_endhere = 0;
        for (int i = 0; i < nums.length; ++i) {
            max_endhere += nums[i];
            if (max_sofar < max_endhere) {
                max_sofar = max_endhere;
            }
            if (max_endhere < 0) {
                max_endhere = 0;
            }

        }
        return max_sofar;
    }

    public static int maxSubArray3(int[] nums) {

        int[] dp = new int[nums.length];
        int max=dp[0]=nums[0];
        int i=1;
        while(i<nums.length){
            dp[i]=Math.max(dp[i-1]+nums[i],nums[i]); //The maximum value will be either the value itself or addition of previous maximum and current value
            if(dp[i]>max)max=dp[i];
            i++;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums2 = {1, 2};
        int[] nums3 = {1};
        int[] nums4 = {-2, 1};
        int[] nums5 = {-1, 0, -2};
        System.out.println(maxSubArray2(nums1));
        System.out.println(maxSubArray(nums2));
        System.out.println(maxSubArray(nums3));
        System.out.println(maxSubArray(nums4));
        System.out.println(maxSubArray(nums5));
    }
}
