package _20;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class _23zhs {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
//        PriorityQueue<ListNode> queue = new PriorityQueue<>((o1, o2) -> o1.val - o2.val);
        PriorityQueue<ListNode> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o.val));
        for (ListNode list : lists) {
            if (list != null) {
                queue.add(list);
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        while (!queue.isEmpty()) {
            ListNode q = queue.poll();
            if(q.next!=null){
                queue.add(q.next);
            }
            p.next = q;
            p = p.next;
        }
        return dummy.next;
    }
}
