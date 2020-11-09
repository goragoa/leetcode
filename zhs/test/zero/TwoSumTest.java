package test.zero;

import main.zero.TwoSum;
import org.junit.Test;

/**
 * @author zhangshuo
 */
public class TwoSumTest {
    @Test
    public void twoSumTest() {
        TwoSum testCase = new TwoSum();
        assert isSameAnswer(testCase.twoSum(new int[]{2, 7, 11, 15}, 9), new int[]{0, 1});
        assert isSameAnswer(testCase.twoSum(new int[]{3, 2, 4}, 6), new int[]{1, 2});
        assert isSameAnswer(testCase.twoSum(new int[]{3, 3}, 6), new int[]{0, 1});
    }

    private boolean isSameAnswer(int[] a, int[] b) {
        assert a.length == 2 && b.length == 2;
        return (a[0] == b[0] && a[1] == b[1]) || (a[0] == b[1] && a[1] == b[0]);
    }
}
