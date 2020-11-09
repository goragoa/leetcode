package test.zero;

import main.zero.AddTwoNumbers;
import org.junit.Test;
import utils.ListNode;

/**
 * @author zhangshuo
 */
public class AddTwoNumbersTest {
    @Test
    public void addTwoNumbersTest() {
        ListNode l1 = new ListNode(new int[]{9, 9, 9, 9, 9, 9, 9});
        ListNode l2 = new ListNode(new int[]{9, 9, 9, 9});
        AddTwoNumbers t = new AddTwoNumbers();
        ListNode ans = t.addTwoNumbers(l1, l2);
        assert ans.equals(new ListNode(new int[]{8, 9, 9, 9, 0, 0, 0, 1}));
    }
}
