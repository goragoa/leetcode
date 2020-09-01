package main.zero;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zhangshuo
 */
public class LengthOfLongestSubString {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        Set<Character> occ = new HashSet<>();
        int i = 0;
        for (int j = 0; j < s.length(); j++) {
            while (occ.contains(s.charAt(j))) {
                occ.remove(s.charAt(i));
                i++;
            }
            occ.add(s.charAt(j));
            maxLength = Math.max(maxLength, j - i + 1);

        }
        return maxLength;
    }
}
