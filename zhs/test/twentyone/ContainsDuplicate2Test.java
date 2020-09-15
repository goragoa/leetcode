package test.twentyone;

import main.twentyone.ContainsDuplicate2;
import org.junit.Test;

/**
 * Created on 2020/9/15 19:07.
 *
 * @author zhangshuo
 * @email zhangshuo@css.com.cn
 */
public class ContainsDuplicate2Test {
    @Test
    public void containsDuplicate2Test() {
        ContainsDuplicate2 t = new ContainsDuplicate2();
        assert t.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3);
        assert t.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1);
        assert !t.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2);
    }
}
