package test.zero;

import main.zero.TwoSum;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created on 2020/9/1 17:55.
 *
 * @author zhangshuo
 */
public class TwoSumTest {
    @Test
    public void twoSum() {
        TwoSum t = new TwoSum();
        int[] ans = t.twoSum(new int[]{2, 7, 11, 15}, 9);
        Assert.assertArrayEquals(ans, new int[]{0, 1});
    }
}
