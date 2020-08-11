//package _50;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class _51zhs {
//    int[] rows;
//    int[] hills;
//    int[] dales;
//    int n;
//    List<List<String>> output = new ArrayList<>();
//    int[] queens;
//
//    public boolean isNotUnderAttack(int row, int col) {
//        int res = rows[col] + hills[row - col + 2 * n] + dales[row + col];
//        return res == 0;
//    }
//
//    public void placeQueen(int row, int col) {
//        queens[row] = col;
//        rows[col] = 1;
//        hills[row - col + 2 * n] = 1;
//        dales[row + col] = 1;
//    }
//
//    public void removeQueen(int row, int col) {
//        queens[row] = 0;
//        rows[col] = 0;
//        hills[row - col + 2 * n] = 0;
//        dales[row + col] = 0;
//    }
//
//    public void addSolution() {
//        List<String> solution = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            int col = queens[i];
//            String sb = ".".repeat(Math.max(0, col)) +
//                    "Q" +
//                    ".".repeat(Math.max(0, n - col));
//            solution.add(sb);
//        }
//        output.add(solution);
//    }
//
//    public void backtrack(int row) {
//        for (int col = 0; col < n; col++) {
//            if (isNotUnderAttack(row, col)) {
//                placeQueen(row, col);
//                if (row + 1 == n) addSolution();
//                else backtrack(row + 1);
//                removeQueen(row, col);
//            }
//        }
//    }
//
//    public List<List<String>> solveNQueens(int n) {
//        this.n = n;
//        rows = new int[n];
//        hills = new int[4 * n - 1];
//        dales = new int[2 * n - 1];
//        queens = new int[n];
//        backtrack(0);
//        return output;
//    }
//}
