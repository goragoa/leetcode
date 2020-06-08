package _80;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class _84zhs {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int[] board = new int[heights.length + 2];
        System.arraycopy(heights, 0, board, 1, heights.length);
        int n = board.length;
        int[] left = new int[n];
        int[] right = new int[n];
        for (int i = 1; i < n; i++) {
            while (!stack.empty() && board[stack.peek()] >= board[i]) {
                right[stack.pop()] = i;
            }
            if (!stack.empty()) left[i] = stack.peek();
            stack.push(i);
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, (right[i] - left[i] - 1) * board[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        _84zhs test = new _84zhs();
        System.out.println(test.largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3}));
    }
}
