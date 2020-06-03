package _20;

import java.util.ArrayList;
import java.util.List;

public class _22zhs {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backtrack(ans, new StringBuilder(), 0, 0, n);
        return ans;
    }

    public void backtrack(List<String> ans, StringBuilder curr, int open, int close, int max) {
        if (curr.length() == max * 2) {
            ans.add(curr.toString());
            return;
        }
        if (open < max) {
            curr.append('(');
            backtrack(ans, curr, open + 1, close, max);
            curr.deleteCharAt(curr.length() - 1);
        }
        if (close < open) {
            curr.append(')');
            backtrack(ans, curr, open, close + 1, max);
            curr.deleteCharAt(curr.length() - 1);
        }
    }
}
