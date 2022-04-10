package study.leetcode.slidingWindow;

public class MinimumSizeSubarraySum_209 {
    public int minSubArrayLen_justEqual(int target, int[] nums) {
        int windowTotal = 0;
        int size = 0;
        int currentWindowSize;
        int leftIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            windowTotal += nums[i];
            while (windowTotal > target) {
                windowTotal -= nums[leftIndex++];
            }
            if (windowTotal == target) {
                currentWindowSize = i - leftIndex + 1;
                if (currentWindowSize < size || size == 0) {
                    size = currentWindowSize;
                }
            }

        }
        return size;
    }

    public int minSubArrayLen(int target, int[] nums) {
        int windowTotal = 0;
        int size = Integer.MAX_VALUE;
        // int currentWindowSize;
        int leftIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            windowTotal += nums[i];
            while (windowTotal >= target) {
                /*currentWindowSize = i - leftIndex + 1;
                if (currentWindowSize < size) {
                    size = currentWindowSize;
                }*/
                size = Math.min(size, i - leftIndex + 1);
                windowTotal -= nums[leftIndex++];
            }
        }
        return size;
    }

    public static void main(String[] args) {
        int[] array = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(new MinimumSizeSubarraySum_209().minSubArrayLen(target,array));
    }
}
