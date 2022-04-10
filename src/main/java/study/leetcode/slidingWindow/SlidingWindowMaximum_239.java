package study.leetcode.slidingWindow;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum_239 {


    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        int j = 0;
        Deque<Integer> windowList = new LinkedList();
       for (int i = 0; i < nums.length; i++) {
           while (!windowList.isEmpty() && nums[i] > windowList.peekLast()) {
               windowList.pollLast();
           }
           windowList.add(nums[i]);
           if (i < k) {
               if (i == (k - 1)) {result[j++] = windowList.peekFirst();}
               continue;
           } else {
               if (windowList.peekFirst() == nums[i - k]) {
                   windowList.pollFirst();
               }
           }
           result[j++] = windowList.peekFirst();
       }
       return result;
    }



    public int[] maxSlidingWindow_1(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        int windowMax = Integer.MIN_VALUE;
        int rightIndex = 0;
        Deque<Integer> windowList = new LinkedList();
        while (rightIndex < k) {
            windowMax = Math.max(nums[rightIndex], windowMax);
            windowList.add(nums[rightIndex++]);
        }
        int i = 0;
        result[i++] = windowMax;
        for (; rightIndex < nums.length; rightIndex++) {
            windowList.add(nums[rightIndex]);
            while (windowList.peekFirst() != windowMax) {
                windowList.pollFirst();
            }
            if (windowList.size() > k) {windowList.pollFirst();}
            windowMax = getMaxNumber(windowList);
            result[i++] = windowMax;
        }
        return result;
    }

    private int getMaxNumber(Deque<Integer> windowList) {
        int temp = Integer.MIN_VALUE;
        for (Integer number : windowList) {
            temp = Math.max(temp, number);
        }
        return temp;
    }


    public int[] maxSlidingWindow_2(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        int resultIndex = 0;
        int rightIndex = k - 1;
        int leftIndex = 0;
        while (rightIndex <= nums.length - 1) {
            //find Max number for current window
            int currentMaxNumber = getMaxNumber(nums, leftIndex, rightIndex);
            result[resultIndex++] = currentMaxNumber;
            rightIndex ++;
            leftIndex ++;
        }
        return  result;
    }

    private int getMaxNumber(int[] nums, int leftIndex, int rightIndex) {
        int defaultNumber = nums[leftIndex];
        while (leftIndex < rightIndex) {
            leftIndex ++;
            if (defaultNumber < nums[leftIndex]) {defaultNumber = nums[leftIndex];}
        }
        return defaultNumber;
    }

    public static void main(String[] args) {
        int[] array = {1,3,-1,-3,5,3,6,7};
        //int[] array = {1,-1};

        new SlidingWindowMaximum_239().maxSlidingWindow(array,3);
    }

}
