package study.leetcode.slidingWindow;

import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters_3 {

    /*Input: s = "pwwkew"
    Output: 3
    Explanation: The answer is "wke", with the length of 3.
    Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.*/

    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        int leftIndex = 0;
        int rightIndex = 0;
        char[] chars = s.toCharArray();
        Map<Character, Integer> windowMap = new HashMap();
        while (rightIndex < s.length()) {
            if (!windowMap.containsKey(chars[rightIndex])) {
                windowMap.put(chars[rightIndex], rightIndex);
            } else {
                if (windowMap.size() > result) {result = windowMap.size();}
                //remove character from leftIndex to windowMap.get(chars[rightIndex])
                while (leftIndex < windowMap.get(chars[rightIndex])) {
                    windowMap.remove(chars[leftIndex]);
                    leftIndex++;
                }
                leftIndex++;
                //update leftIndex to windowMap.get(chars[rightIndex]) + 1
                //leftIndex = windowMap.get(chars[rightIndex]);
                // put rightIndex character to windowMap
                windowMap.put(chars[rightIndex], rightIndex);
            }
            rightIndex ++;
        }
        if (windowMap.size() > result) {result = windowMap.size();}
        return result;
    }


    public static void main(String[] args) {
        Assert.assertEquals(3, new LongestSubstringWithoutRepeatingCharacters_3().lengthOfLongestSubstring("pwwkew"));
        Assert.assertEquals(3, new LongestSubstringWithoutRepeatingCharacters_3().lengthOfLongestSubstring("abcabcbb"));
    }

}
