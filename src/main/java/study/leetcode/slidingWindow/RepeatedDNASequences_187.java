package study.leetcode.slidingWindow;

import java.util.*;

public class RepeatedDNASequences_187 {
    public List<String> findRepeatedDnaSequences(String s) {
        if(s == null || s.length() < 10) {
            return Collections.emptyList();
        }
        Set<String> set = new HashSet<>();
        Set<String> tempSet = new HashSet<>();
        set.add(s.substring(0, 10));
        for (int i = 11; i <= s.length(); i++) {
            String subString = s.substring(i - 10, i);
            if (!set.add(subString)) {
                tempSet.add(subString);
            }
        }
        List<String> list = new ArrayList<>(tempSet);
        return list;
    }

    public static void main(String[] args) {
        new RepeatedDNASequences_187().findRepeatedDnaSequences("AAAAAAAAAAA");
    }

}
