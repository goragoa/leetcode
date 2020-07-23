package _80;

import java.util.Stack;

public class _85zhs {
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

    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0) return 0;
        if (matrix[0].length == 0) return 0;
        int maxArea = 0;
        int[] heights = new int[matrix[0].length];
        for (char[] chars : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                heights[j] = (chars[j] == '0') ? 0 : (heights[j] + 1);
            }
            maxArea = Math.max(maxArea, largestRectangleArea(heights));
        }
        return maxArea;
    }
}
