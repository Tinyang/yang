package study.leetcode;

import java.util.Arrays;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int lastNum = nums[0];
        int lastStartIndex = 0;
        int lastNumlength = 0;
        int majorElement = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            if (currentNum != lastNum) {
                if (i - lastStartIndex > lastNumlength) {
                    lastNumlength = i -lastStartIndex;
                    majorElement = lastNum;
                }
                lastNum = currentNum;
                lastStartIndex = i;
            }
            if (i == nums.length - 1) {
                if (i - lastStartIndex + 1 > lastNumlength) {
                    return currentNum;
                }
            }
        }
        return majorElement;
    }

    public int majorityElement2(int[] nums) {
        int currentNumber = nums[0];
        int count = 0;
        for (int number: nums) {
            if (number == currentNumber) {
                count ++;
            } else {
                count --;
            }
            if (count == 0) {
                currentNumber = number;
                count ++;
            }
        }
        return currentNumber;
    }

    public static void main(String[] args) {
        int[] array = {3,2,4};
        System.out.println(new MajorityElement().majorityElement(array));
    }
}
