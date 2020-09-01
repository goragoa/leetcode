package test.zero;

import main.zero.AddTwoNumbers;
import org.junit.Assert;
import org.junit.Test;
import utils.ListNode;

/**
 * Created on 2020/9/1 17:58.
 *
 * @author zhangshuo
 */
public class AddTwoNumbersTest {
    @Test
    public void addTwoNumbers() {
        AddTwoNumbers t = new AddTwoNumbers();
        ListNode l1 = new ListNode(new int[]{2, 4, 3});
        ListNode l2 = new ListNode(new int[]{5, 6, 4});
        ListNode ans = t.addTwoNumbers(l1, l2);
        Assert.assertTrue(new ListNode(new int[]{7, 0, 8}).equals(ans));
    }
}
