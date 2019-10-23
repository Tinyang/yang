package study.leetcode;

public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int num = 0;
        char[] chars = s.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            char temp = chars[i];
            num = num + (temp - 'A' + 1) * (int)Math.pow(26, chars.length - 1 - i);
        }
        return num;
    }
}
