package study.leetcode.slidingWindow;

import org.junit.Assert;

import java.util.Deque;
import java.util.LinkedList;

public class MaximumNumberOfVowels_1456 {

    public int maxVowels(String s, int k) {
        int rightIndex = 0;
        int vowelNums = 0;
        int maxVowelNums = 0;
        char[] chars = s.toCharArray();
        Deque<Character> windowList = new LinkedList<>();
        while (rightIndex < chars.length) {
            if (rightIndex < k) {
                if (isVowelChar(chars[rightIndex])) {
                    vowelNums ++;
                }
            } else {
                boolean isVowelChar = isVowelChar(windowList.removeFirst());
                if (!isVowelChar && isVowelChar(chars[rightIndex])) {
                    vowelNums ++;
                }
                if (isVowelChar && !isVowelChar(chars[rightIndex])) {
                    vowelNums --;
                }
            }
            windowList.add(chars[rightIndex]);
            if (vowelNums > maxVowelNums) {maxVowelNums = vowelNums;}
            rightIndex ++;
        }
        return maxVowelNums;
    }

    private boolean isVowelChar(char aChar) {
        if (aChar == 'a' || aChar == 'e' || aChar == 'i' || aChar == 'o' || aChar == 'u') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Assert.assertEquals(3, new MaximumNumberOfVowels_1456().maxVowels("abciiidef" ,3));
        Assert.assertEquals(2, new MaximumNumberOfVowels_1456().maxVowels("aeiou", 2));
        Assert.assertEquals(2, new MaximumNumberOfVowels_1456().maxVowels("leetcode", 3));
    }
}
