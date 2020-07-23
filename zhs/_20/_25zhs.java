package _20;

public class _25zhs {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public int getLength(ListNode head) {
        if (head == null) {
            return 0;
        }
        return 1 + getLength(head.next);
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if (k != 1 && getLength(head) >= k) {
            ListNode ans = head;
            int count;
            ListNode p = head;
            ListNode q;
            for (int i = 0; i < k - 1; i++) {
                ans = ans.next;
            }
            while (getLength(p) >= k) {
                count = 0;
                q = p.next;
                while (count < k - 1) {
                    p.next = q.next;
                    q.next = head;
                    head = q;
                    q = p.next;
                    count++;
                }
                if (getLength(q) >= k) {
                    ListNode con = q;
                    for (int i = 0; i < k - 1; i++) {
                        con = con.next;
                    }
                    p.next = con;
                }
                p = q;
                head = q;
            }
            return ans;
        } else {
            return head;
        }
    }

    public static void main(String[] args) {
        _25zhs t = new _25zhs();
        ListNode inp = new ListNode(1);
        inp.next = new ListNode(2);
        inp.next.next = new ListNode(3);
        inp.next.next.next = new ListNode(4);
        inp.next.next.next.next = new ListNode(5);
        ListNode ans = t.reverseKGroup(inp, 2);
        while (ans != null) {
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
}