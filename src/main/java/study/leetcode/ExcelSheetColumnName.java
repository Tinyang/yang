package study.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExcelSheetColumnName {
    public String convertToTitle(int n) {
        Map map = new HashMap();
        char temp = 'A';
        for(int i = 1; i <= 26; i++){
            map.put(i,String.valueOf(temp));
            temp = (char) ((int)temp + 1);
        }
        List list = new ArrayList();
        list.add(n % 26);
        while (n != 0){
            n = n / 26;
            list.add(n % 26);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++){
            sb.append(map.get(list.get(i)));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        /*System.out.println(1000 % 26);
        System.out.println(1000 / 26 % 26);
        System.out.println(1000 / 26 / 26 % 26);
        System.out.println(1000 / 26 / 26 / 26 % 26);*/
        String tt = new ExcelSheetColumnName().convertToTitle(36);
    }
}
