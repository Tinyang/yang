package study.leetcode;

import java.util.LinkedList;
import java.util.List;

/*Given a non-empty array of integers, return the third maximum number in this array.
If it does not exist, return the maximum number. The time complexity must be in O(n).
Example 1:
Input: [3, 2, 1]
Output: 1

Explanation: The third maximum is 1.

Example 2:
Input: [1, 2]
Output: 2

Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
Example 3:
Input: [2, 2, 3, 1]
Output: 1

Explanation: Note that the third maximum here means the third maximum distinct number.
Both numbers with value 2 are both considered as second maximum.
        */
public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        if (null == nums || nums.length <= 0) {
            return -1;
        }
        boolean haveSetFirstValue = false;
        int[] tempArray = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        for (int num : nums) {
            int min = tempArray[0];
            int med = tempArray[1];
            int max = tempArray[2];
            if (num == Integer.MIN_VALUE) {
                haveSetFirstValue = true;
            }
            if (num > max ) {
                tempArray[2] = num;
                tempArray[1] = max;
                tempArray[0] = med;
            } else if (num < max && num > med) {
                tempArray[1] = num;
                tempArray[0] = med;
            } else if (num < med && num > min) {
                tempArray[0] = num;
            }
        }
        return tempArray[0] == Integer.MIN_VALUE ? (haveSetFirstValue ? Integer.MIN_VALUE : tempArray[2]) : tempArray[0];
    }

    public int thirdMax2(int[] nums) {
        if (null == nums || nums.length <= 0) {
            return -1;
        }
        List<Integer> list = new LinkedList<>();
        for (int num : nums) {
            Integer min = list.get(0);
            Integer med = list.get(1);
            Integer max = list.get(2);
            if (num > max || max == null) {
                list.set(2,num);
                list.set(1,max);
                list.set(0,med);
            } else if (num < max && num > med) {
                list.set(1,num);
                list.set(0,med);
            } else if (num < med && num > min) {
                list.set(0,num);
            }
        }
        if (list.get(0) == null) {
            return list.get(2);
        }
        return list.get(0);
    }


    public static void main(String[] args) {
        new ThirdMaximumNumber().thirdMax(new int[]{-2147483648,1,1});
    }
}
