package main.zero;

import java.util.HashSet;

/**
 * @author zhangshuo
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int tmpLength = 0, maxLength = 0;
        int head = -1;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                while (set.contains(s.charAt(i))) {
                    head += 1;
                    set.remove(s.charAt(head));
                    tmpLength -= 1;
                }
            }
            tmpLength += 1;
            maxLength = Math.max(maxLength, tmpLength);
            set.add(s.charAt(i));
        }
        return maxLength;
    }
}
