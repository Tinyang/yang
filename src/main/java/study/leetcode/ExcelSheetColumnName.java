package study.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExcelSheetColumnName {
    public String convertToTitle(int n) {
        List list = new ArrayList();
        list.add(getNum(n));
        n = n / 26;
        while (n > 26) {
            list.add(getNum(n));
            n = n / 26;
        }
        if (n != 0) {
            list.add(getNum(n));
        }
        Map map = getMap();
        StringBuilder sb = new StringBuilder();
        for (int i = list.size() - 1; i >= 0; i--) {
            sb.append(map.get(list.get(i)));
        }
        return sb.toString();
    }

    private Map getMap() {
        Map map = new HashMap();
        char temp = 'A';
        for (int i = 1; i <= 26; i++) {
            map.put(i, String.valueOf(temp));
            temp = (char) (temp + 1);
        }
        return map;
    }

    private int getNum(int num) {
        return num % 26 == 0 ? 26 : num % 26;
    }

    public static void main(String[] args) {
        System.out.println(1000 % 26);
        System.out.println(1000 / 26 % 26);
        System.out.println(1000 / 26 / 26 % 26);
        System.out.println(1000 / 26 / 26 / 26 % 26);
        String tt = new ExcelSheetColumnName().convertToTitle(1000);
    }
}
