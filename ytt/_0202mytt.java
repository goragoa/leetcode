public class _0202mytt {
    public int kthToLast(ListNode head, int k) {
        int length = 0;
        ListNode now = head;
        while(now.next != null){
            length++;
            now = now.next;
        }
        now = head;
        for(int i=0 ; i<=length-k ; i++)
        {
            now = now.next;
        }
        return now.val;
    }

    public static void main(String[] args) {
        _0202mytt test = new _0202mytt();
        ListNode listNode0 = new ListNode(0);
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        ListNode listNode6 = new ListNode(6);
        ListNode listNode7 = new ListNode(7);
        ListNode listNode8 = new ListNode(8);

        listNode0.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        listNode6.next = listNode7;
        listNode7.next = listNode8;
        listNode8.next = null;

        System.out.println(test.kthToLast(listNode0, 2));;
    }
}
