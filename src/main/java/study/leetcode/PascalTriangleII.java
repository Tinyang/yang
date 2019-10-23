package study.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List list = new ArrayList<Integer>();
        if (rowIndex == 0){
            list.add(1);
            return list;
        }else {
            return getLastListByPreList(getRow(rowIndex - 1));
        }
    }

    private List<Integer> getLastListByPreList(List<Integer> integers) {
        List list = new ArrayList<Integer>();
        int preTemp = 1;
        for (int i = 0; i < integers.size(); i++) {
            if (i == 0) {
                list.add(1);
            } else {
                list.add(preTemp + integers.get(i));
                preTemp = integers.get(i);
            }
        }
        list.add(1);
        return list;
    }

    public static void main(String[] args) {
        System.out.print(new PascalTriangleII().getRow(3));
    }
}
