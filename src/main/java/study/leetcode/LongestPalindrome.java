package study.leetcode;

public class LongestPalindrome {

        public String longestPalindrome(String s) {
            if (null == s || s.length() <= 0) {
                return null;
            }
            int length = 0;
            int first = 0;
            int second = 0;
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length - 1; i++) {
                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[i] == chars[j]) {
                        int temp = j - i;
                        if (temp > length) {
                            length = temp;
                            first = i;
                            second = j;
                        }
                    }
                }


            }
            return s.substring(first,second+1);
        }


    public String reverse(String x) {
        char[] chars = String.valueOf(x).toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            sb.append(chars[chars.length - 1 - i]);
        }
        String str = sb.toString();
        char a = str.charAt(str.length() - 1);
        char b = str.charAt(0);
        if (b == '0' && a != b) {
            String str1 = str.substring(1);
            if (a == '-') {
                String str2 = "-" + str.substring(0, str1.length() - 1);
                return str2;
            }
            return str1;
        }
        if (a == '-') {
            String str3 = "-" + str.substring(0, str.length() - 1);
            return str3;
        }
        return str;
    }


        public static void main(String[] args) {
           String a = new LongestPalindrome().reverse("9646324351");
            System.out.println(a);
        }
    }


