package leetcode;

public class TwoSum_1 {
    public int[] twoSum(int[] nums, int target) {
        int addResult;
        for (int k = 0; k < nums.length - 1; k++) {
            for (int i = k + 1; i < nums.length; i++) {
                addResult = nums[k] + nums[i];
                if (addResult == target && k != i) {
                    return new int[]{k, i};
                }
            }
        }
        return null;
    }
}
