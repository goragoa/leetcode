package more;

public class _0202m_zhs {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public int kthToLast(ListNode head, int k) {
        ListNode p1 = head;
        ListNode p2 = head;
        for (int i = 0; i < k - 1; i++) {
            p2 = p2.next;
        }
        while (p2.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1.val;
    }

    public static void main(String[] args) {
        _0202m_zhs t = new _0202m_zhs();
        ListNode root = new ListNode(1);
        ListNode c = root;
        for (int i = 2; i <= 5; i++) {
            ListNode n = new ListNode(i);
            c.next = n;
            c = n;
        }
        System.out.println(t.kthToLast(root, 2));
    }
}
