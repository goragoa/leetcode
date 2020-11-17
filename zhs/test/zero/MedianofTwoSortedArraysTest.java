package test.zero;

import main.zero.MedianofTwoSortedArrays;
import org.junit.Test;

/**
 * @author zhangshuo
 * @date 2020/11/16
 */

public class MedianofTwoSortedArraysTest {
    @Test
    public void medianofTwoSortedArraysTest() {
        MedianofTwoSortedArrays t = new MedianofTwoSortedArrays();

        double test0 = t.findMedianSortedArrays(new int[]{1, 3}, new int[]{2});
        assert test0 > 2.0d - 0.01d & test0 < 2.0d + 0.01d;

        double test1 = t.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4});
        assert test1 > 2.5d - 0.01d & test1 < 2.5d + 0.01d;

        double test2 = t.findMedianSortedArrays(new int[]{0, 0}, new int[]{0, 0});
        assert test2 > 0.0d - 0.01d & test2 < 0.0d + 0.01d;

        double test3 = t.findMedianSortedArrays(new int[]{}, new int[]{1});
        assert test3 > 1.0d - 0.01d & test3 < 1.0d + 0.01d;

        double test4 = t.findMedianSortedArrays(new int[]{2}, new int[]{});
        assert test4 > 2.0d - 0.01d & test4 < 2.0d + 0.01d;
    }
}
