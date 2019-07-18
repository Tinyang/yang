package study.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ValidPalindrome {


    public boolean isPalindrome(String s) {
        if(null == s || s.length() <= 0){
            return true;
        }
        List<Character> chars = convertToChars(s);
        for(int i = 0; i < chars.size()/2; i++){
            if(chars.get(i).charValue() != chars.get(chars.size() - 1 - i).charValue()){
                return false;
            }
        }
        return true;
                
    }
    private List<Character> convertToChars(String s) {
        char[] chars = s.toCharArray();
        List list = new ArrayList<Character>();
        for(int i = 0; i < chars.length; i++){
            char c = chars[i];
            if(c <= 'z' && c >= 'a'){
                list.add(c);
            }else if(c <= 'Z' && c >= 'A'){
                int temp = (int)c + 32;
                list.add(new Character((char)temp));
            }else if(c <= 57 && c >= 48){
                list.add(c);
            }
        }
        return list;
    }

    public static void main(String[] args) {


        String s = "0P";
        boolean flag = new ValidPalindrome().isPalindrome(s);
        System.out.println(flag);
    }
}
