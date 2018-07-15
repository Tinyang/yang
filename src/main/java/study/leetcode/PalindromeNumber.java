package study.leetcode;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            sb.append(charArray[charArray.length - 1 - i]);
        }
        return str.equals(sb.toString()) ? true : false;
    }

    public static void main(String[] args) {
        if (false)
            System.out.println("666");
        System.out.println("777");

    }

}
