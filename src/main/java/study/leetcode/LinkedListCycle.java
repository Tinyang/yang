package study.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LinkedListCycle {
    public Double d1;
    public boolean hasCycle(ListNode head) {
        if (null != head) {
            List list = new ArrayList();
            list.add(head);
            ListNode next = head.next;
            while (null != next) {
                if (existSameNode(next,list)){
                    return true;
                }
                list.add(next);
                next = head.next;
            }
        }
        return false;
    }

    private boolean existSameNode(ListNode next, List<ListNode> list) {
        for (ListNode target:list) {
            if (target == next){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Double t = new LinkedListCycle().d1;
    }

}
