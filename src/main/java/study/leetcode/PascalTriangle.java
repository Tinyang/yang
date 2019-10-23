package study.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0){
            return new ArrayList<List<Integer>>();
        }
        if (numRows == 1) {
            List rowList = new ArrayList<Integer>();
            rowList.add(new Integer(1));
            List list = new ArrayList<List<Integer>>();
            list.add(rowList);
            return list;
        } else {
            int size = numRows - 1;
            List<List<Integer>> temp = generate(size);
            temp.add(getLastListByPreList(temp.get(size - 1)));
            return temp;
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
        System.out.print(new PascalTriangle().generate(20));
    }
}
