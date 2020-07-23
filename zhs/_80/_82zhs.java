package _80;

import java.util.Arrays;

public class _82zhs {
    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        ListNode p = head;
        ListNode q = head.next;
        while (q != null) {
            if (p.val == q.val) {
                q = q.next;
            } else {
                if (q == p.next) {
                    curr.next = p;
                    curr = curr.next;
                    curr.next = null;
                }
                p = q;
                q = p.next;
            }
        }
        if (p.next == null) {
            curr.next = p;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        _82zhs t = new _82zhs();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        ListNode ans = t.deleteDuplicates(head);
        System.out.println(ans.toString());
    }

}
