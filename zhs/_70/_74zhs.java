package _70;

public class _74zhs {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        if (m == 0) return false;
        int n = matrix[0].length;
        if (n == 0) return false;
        int left = 0, right = m * n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (target == matrix[mid / n][mid % n]) return true;
            else {
                if (target < matrix[mid / n][mid % n]) right = mid - 1;
                else left = mid + 1;
            }
        }
        return false;
    }
}
