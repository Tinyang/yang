package study.leetcode;

public class ReverseInteger {
    /*
Given a 32-bit signed integer, reverse digits of an integer.
Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
     */
    public int reverse(int x) {
        char[] chars = String.valueOf(x).toCharArray();
        char[] temp = new char[chars.length];
        for(int i = chars.length -1; i >= 0; i--){
            temp[chars.length - 1 - i] = chars[i];
        }
        int i;
        for(i = 0; i < temp.length; i++){
            if(temp[i] != '0' || temp.length <= 1){
                break;
            }
        }
        String intStr = String.valueOf(temp).substring(i);
        if(intStr.endsWith("-")){
            intStr = "-" + intStr.substring(0,intStr.length() - 1);
        }
        return Integer.valueOf(intStr);
    }

    public static void main(String[] args) {
        //System.out.println(new ReverseInteger().reverse(-1200));
        //System.out.println(new ReverseInteger().reverse(0));
        //System.out.println(new ReverseInteger().reverse(1534236469));
        System.out.println(Integer.valueOf("9646324351"));
    }

}
