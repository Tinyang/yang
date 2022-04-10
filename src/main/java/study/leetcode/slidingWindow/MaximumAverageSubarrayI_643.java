package study.leetcode.slidingWindow;

public class MaximumAverageSubarrayI_643 {
    public double findMaxAverage(int[] nums, int k) {
        int total = 0;
        int tempTotal = 0;
        for (int i = 0; i < nums.length; i++ ) {
            if (i < k) {
                total += nums[i];
                if (i == k - 1) {
                    tempTotal = total;
                }
            } else {
                tempTotal = tempTotal + nums[i] - nums[i - k];
                if (tempTotal > total) {
                    total = tempTotal;
                }
            }
        }
        return total / (double) k;
    }


    public static void main(String[] args) {
        int[] arrays = {1,12,-5,-6,50,3};
        System.out.println(new MaximumAverageSubarrayI_643().findMaxAverage(arrays,4));
        new MaximumAverageSubarrayI_643().findMaxAverage(arrays,4);
    }
}
