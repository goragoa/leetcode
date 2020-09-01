package test.zero;

import main.zero.LengthOfLongestSubString;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created on 2020/9/1 18:00.
 *
 * @author zhangshuo
 */
public class LengthOfLongestSubStringTest {
    @Test
    public void longestSubstringWithoutRepeatingCharacters() {
        LengthOfLongestSubString t = new LengthOfLongestSubString();
        Assert.assertEquals(t.lengthOfLongestSubstring("abcabcbb"), 3);
    }
}
