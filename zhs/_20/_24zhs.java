package _20;

public class _24zhs {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = head, q = head.next;
        ListNode dummy = new ListNode(0), d = dummy;
        while (true) {
            d.next = p.next;
            p.next = q.next;
            q.next = p;
            if (p.next!=null && p.next.next!=null) {
                d = p;
                q = p.next.next;
                p = p.next;
            } else {
                break;
            }
        }
        return dummy.next;
    }
}
