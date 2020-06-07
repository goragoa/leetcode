package _70;

import java.util.LinkedList;
import java.util.List;

public class _77zhs {
    List<List<Integer>> output = new LinkedList<>();
    int n, k;

    public void backtrack(int first, LinkedList<Integer> curr) {
        if (curr.size() == k) {
            output.add(new LinkedList<>(curr));
            return;
        }
        for (int i = first; i < n + 1; i++) {
            curr.add(i);
            backtrack(i + 1, curr);
            curr.removeLast();
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        this.n = n;
        this.k = k;
        backtrack(1, new LinkedList<Integer>());
        return output;
    }
}
