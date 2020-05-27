package study.leetcode;

/*
Given an array of integers and an integer k,
find out whether there are two distinct indices i and j in the array
such that nums[i] = nums[j] and the absolute difference between i and j is at most k.
Example 1:
Input: nums = [1,2,3,1], k = 3
Output: true  0-3

Example 2:
Input: nums = [1,0,1,1], k = 1
Output: true  0-2-3

Example 3:
Input: nums = [1,2,3,1,2,3], k = 2
Output: false 0-3 2-5 1-4
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        List<List<Integer>> list = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.get(nums[i]).add(i);
            } else {
                List tempList = new ArrayList<>();
                tempList.add(i);
                map.put(nums[i], tempList);
            }
        }
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            List<Integer> tempList = entry.getValue();
            if (tempList.size() > 1) {
                for (int i = tempList.size() - 1; i >= 0; i--) {
                    if ( (i - 1 >= 0) && (tempList.get(i) - tempList.get(i - 1) <= k)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,1};
        new ContainsDuplicateII().containsNearbyDuplicate(array,3);
    }


}
