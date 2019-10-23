package study.leetcode;


import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * Write a function to find the longest common prefix string amongst an array of strings.

 If there is no common prefix, return an empty string "".

 Example 1:

 Input: ["flower","flow","flight"]
 Output: "fl"
 Example 2:

 Input: ["dog","racecar","car"]
 Output: ""
 Explanation: There is no common prefix among the input strings.
 */

/**
 * This may be a solution to the longest chid str
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if(null == strs || strs.length == 0){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        String str = strs[0];
        String longestPrefix = "";
        for (int i = 0; i < str.length() ; i++) {
            for (int j = str.length(); j > i ; j--) {
                String temp = str.substring(i,j);
                if(checkIfCommonStr(strs, temp) && temp.length() > longestPrefix.length()){
                    longestPrefix = temp;
                }
            }
        }
        return longestPrefix;
    }

    private boolean checkIfCommonStr(String[] strs, String str) {
        for (int i = 1; i < strs.length ; i++) {
            if(!strs[i].contains(str))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        //String[] strings = {"flower","flow","flight"};
        String[] strings = {"dog","racecar","car"};
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(strings));
    }
}
