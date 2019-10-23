package study.leetcode;

/**
 * Given two binary strings, return their sum (also a binary string).

 The input strings are both non-empty and contains only characters 1 or 0.

 Example 1:

 Input: a = "11", b = "1"
 Output: "100"
 Example 2:

 Input: a = "1010", b = "1011"
 Output: "10101"
 */
public class AddBinary {

    public static String addBinary(String a, String b) {
        char[] chars1 = a.toCharArray();
        char[] chars2 = b.toCharArray();
        int shorterLength = a.length() < b.length() ? a.length() : b.length();
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < shorterLength; i++){
            char char1 = chars1[chars1.length - i];
            char char2 = chars2[chars2.length - i];
            boolean changeFlag = true;
            boolean equalFlag = (char1 == char2);
            if(equalFlag && equalFlag){

            }
        }


        return  null;

    }

    public static String addBinary2(String a, String b) {
        if(a == null || a.isEmpty())
            return b;
        if(b == null || b.isEmpty())
            return a;

        StringBuilder s = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;

        int carry = 0;

        while( j >= 0 || i >= 0 || carry == 1 ){
            int cA = (i>=0) ? a.charAt(i--) - '0' : 0; // here is i-- to avoid later subtraction
            int cB = (j>=0) ? b.charAt(j--) - '0' : 0;
            int sum = (cA+cB+carry)%2; // == cA ^ cB ^ carry , choose whatever you want :)
            carry = (cA+cB+carry)/2; // better in readability than ((aByte + bByte + carry) >= 2) ? 1 : 0;

            s.append(sum);
        }

        return s.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary2("11","1"));
        System.out.println(addBinary("1010","1011"));

        System.out.println('0' + '1');

    }




}
