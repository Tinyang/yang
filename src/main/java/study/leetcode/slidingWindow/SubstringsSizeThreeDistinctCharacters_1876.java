package study.leetcode.slidingWindow;

public class SubstringsSizeThreeDistinctCharacters_1876 {

    /*Constraints:
    1 <= s.length <= 100
    s consists of lowercase English letters.*/
    public int countGoodSubstrings(String s) {
        if (s.length() < 3) {return 0;}
        int rightIndex = 2;
        int count = 0;
        while (rightIndex < s.length()) {
            char a = s.charAt(rightIndex - 2);
            char b = s.charAt(rightIndex - 1);
            char c = s.charAt(rightIndex);
          if (a != b && a != c && b != c) {
              count ++;
          }
            rightIndex ++;
        }
        return count;
    }


}
