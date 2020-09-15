package test.twentyone;

import main.twentyone.ContainsDuplicate;
import org.junit.Test;

/**
 * Created on 2020/9/15 18:56.
 *
 * @author zhangshuo
 * @email zhangshuo@css.com.cn
 */
public class ContainsDuplicateTest {
    @Test
    public void ContainsDuplicate() {
        ContainsDuplicate t = new ContainsDuplicate();
        assert t.containsDuplicate(new int[]{1, 2, 3, 1});
        assert !t.containsDuplicate(new int[]{1, 2, 3, 4});
    }
}
