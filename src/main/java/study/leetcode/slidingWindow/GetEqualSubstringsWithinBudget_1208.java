package study.leetcode.slidingWindow;

import org.junit.Assert;

public class GetEqualSubstringsWithinBudget_1208 {




    public int equalSubstring(String s, String t, int maxCost) {
        int leftIndex = 0;
        int rightIndex = 0;
        int windowCost = 0;
        int maxLength = 0;
        while (rightIndex < s.length()) {
            if (windowCost <= maxCost) {
                if ((rightIndex - leftIndex) > maxLength) {maxLength = rightIndex - leftIndex;}
                windowCost += Math.abs(s.charAt(rightIndex) - t.charAt(rightIndex));
                rightIndex++;
            } else {
                windowCost -= Math.abs(s.charAt(leftIndex) - t.charAt(leftIndex));
                leftIndex++;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        //Assert.assertEquals(3, new GetEqualSubstringsWithinBudget_1208().equalSubstring("abcd", "bcdf", 3));
        //Assert.assertEquals(1, new GetEqualSubstringsWithinBudget_1208().equalSubstring("abcd", "cdef", 3));
        //Assert.assertEquals(1, new GetEqualSubstringsWithinBudget_1208().equalSubstring("abcd", "acde", 0));
        Assert.assertEquals(4, new GetEqualSubstringsWithinBudget_1208().equalSubstring("krpgjbjjznpzdfy", "nxargkbydxmsgby", 14));
    }
}
