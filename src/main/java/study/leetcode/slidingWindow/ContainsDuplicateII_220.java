package study.leetcode.slidingWindow;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateII_220 {

    /*Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.*/
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int leftIndex = 0;
        int rightIndex = 1;
        Set<Integer> set = new HashSet<>();
        set.add(nums[leftIndex]);
        while (rightIndex < nums.length) {
            if (rightIndex <= k) {
                if (!set.add(nums[rightIndex])) {
                    return true;
                }
            } else {
                set.remove(nums[leftIndex]);
                if (!set.add(nums[rightIndex])) {
                    return true;
                }
                leftIndex++;
            }
            rightIndex++;
        }
        return false;
    }

}