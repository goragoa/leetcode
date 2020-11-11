package test.zero;

import main.zero.LongestSubstringWithoutRepeatingCharacters;
import org.junit.Test;

/**
 * @author zhangshuo
 */
public class LongestSubstringWithoutRepeatingCharactersTest {
    @Test
    public void lengthOfLongestSubstringTest() {
        LongestSubstringWithoutRepeatingCharacters testCase = new LongestSubstringWithoutRepeatingCharacters();
        assert testCase.lengthOfLongestSubstring("abcabcbb") == 3;
        assert testCase.lengthOfLongestSubstring("bbbbb") == 1;
        assert testCase.lengthOfLongestSubstring("pwwkew") == 3;
        assert testCase.lengthOfLongestSubstring("") == 0;
        assert testCase.lengthOfLongestSubstring("aab") == 2;
    }
}
