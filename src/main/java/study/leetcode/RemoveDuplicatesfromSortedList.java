package study.leetcode;

public class RemoveDuplicatesfromSortedList {
    public ListNode2 deleteDuplicates(ListNode2 head) {
        if (head == null) {
            return null;
        }
        if (head.next != null) {
            ListNode2 node = deleteDuplicates(head.next);
            if (head.val == node.val) {
                return node;
            } else {
                head.next = node;
            }
        }
        return head;
    }
}

class ListNode2 {
    int val;
    ListNode2 next;
    ListNode2(int x) { val = x; }
 }