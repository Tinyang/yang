package study.leetcode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        Set set = new HashSet<Integer>();
        for (int i = 0; i < nums.length ; i++) {
            int number = nums[i];
            if(!set.add(number)){
                set.remove(number);
            }
        }
        Iterator iterator = set.iterator();
            return (int) iterator.next();
    }

    public static void main(String[] args) {
        //int[] array = {4,1,2,1,2};
        int[] array1 = {2,2,1};
        System.out.println(new SingleNumber().singleNumber(array1));
    }
}
