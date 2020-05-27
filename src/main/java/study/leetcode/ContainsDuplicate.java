package study.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int number: nums) {
            if (map.containsKey(number)) {
                return true;
            }
            map.put(number,number);
        }
        return false;
    }
}
