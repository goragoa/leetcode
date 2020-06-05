package _60;

public class _63zhs {
    public int uniquePathWithObstacles(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n][m];
        dp[0][0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    dp[i][j] = 0;
                    continue;
                }
                if (j > 0) {
                    dp[i][j] += dp[i][j - 1];
                }
                if (i > 0) {
                    dp[i][j] += dp[i - 1][j];
                }
            }
        }
        return dp[n - 1][m - 1];
    }
}
