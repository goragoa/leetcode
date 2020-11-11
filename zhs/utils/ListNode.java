package utils;

import java.util.Arrays;

/**
 * @author zhangshuo
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int[] x) {
        this.val = x[0];
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
