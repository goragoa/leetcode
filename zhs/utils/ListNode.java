package utils;

import java.util.Arrays;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public ListNode(int[] x) {
        val = x[0];
        if (x.length != 1) {
            this.next = new ListNode(Arrays.copyOfRange(x, 1, x.length));
        }
    }

    public boolean equals(ListNode other) {
        if (other == null) {
            return false;
        } else if (this.next == null && other.next == null) {
            return this.val == other.val;
        } else if (this.next != null && other.next != null) {
            return this.val == other.val && this.next.equals(other.next);
        }
        return false;
    }
}
