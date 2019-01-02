package study.leetcode;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

 Example:

 Input: 1->2->4, 1->3->4
 Output: 1->1->2->3->4->4
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ArrayList<ListNode> list = new ArrayList<>();
        addNodeIntoList(l1, list);
        addNodeIntoList(l2, list);
        list.sort(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        ListNode temp = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            temp.next = list.get(i);
            temp = temp.next;
        }
        return list.get(0);
    }

    private void addNodeIntoList(ListNode l1, ArrayList<ListNode> list) {
        if(null != l1 && null != list){
            list.add(l1);
            while (null != l1.next){
                l1 = l1.next;
                list.add(l1);
            }
        }
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
  }
