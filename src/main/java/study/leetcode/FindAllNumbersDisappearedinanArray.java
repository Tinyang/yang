package study.leetcode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
Find all the elements of [1, n] inclusive that do not appear in this array.
Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
Example:
    Input:
    [4,3,2,7,8,2,3,1]
    Output:
    [5,6]
*/

public class FindAllNumbersDisappearedinanArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            if ((i + 1) < (nums.length - 1)) {
                int length = nums[i+1] - currentNum;
                if (length != 0 && length != 1 ) {
                    while (length > 1) {
                        list.add(currentNum + length - 1);
                        length--;
                    }
                }
            }
        }
        if (list.size() == 0) {
            list.add(nums[nums.length - 1] + 1);
        }
        return list;
    }

    public static void main(String[] args) {
        new FindAllNumbersDisappearedinanArray().findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1});
    }
}
