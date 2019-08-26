package study.leetcode;

import java.util.LinkedList;

public class MinStack {

    private int minimumNum;

    private LinkedList<Integer> linkedList;

    private int size = 0;


    /** initialize your data structure here. */
    public MinStack() {
        linkedList = new LinkedList<Integer>();
    }

    public void push(int x) {
        linkedList.add(x);
        size ++;
        if (size == 0){
            minimumNum = x;
        } else if (x < minimumNum) {
           minimumNum = x;
        }
    }

    public void pop() {
        if (size > 0){
            linkedList.removeLast();
        }
    }

    public int top() {
        return linkedList.getLast();
    }

    public int getMin() {
        return minimumNum;
    }

}
