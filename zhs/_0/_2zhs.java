package _0;

public class _2zhs {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode dummyHead = new ListNode(-1);
        ListNode curr = dummyHead;
        ListNode p = l1, q = l2;
        while (p != null || q != null) {
            int x = p == null ? 0 : p.val;
            int y = q == null ? 0 : q.val;
            int sum = x + y + carry;
            curr.next = new ListNode(sum % 10);
            carry = sum / 10;
            if(p!=null) p = p.next;
            if(q!=null) q = q.next;
            curr = curr.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        _2zhs t = new _2zhs();
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        System.out.println(t.addTwoNumbers(l1, l2));
    }
}
