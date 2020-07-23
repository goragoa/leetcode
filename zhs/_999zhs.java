public class _999zhs {
    public int numRookCaptures(char[][] board) {
        int ans = 0;
        int LEN = 8;
        int x = 0;
        int y = 0;
        for (int i = 0; i < LEN; i++) {
            for (int j = 0; j < LEN; j++) {
                if (board[i][j] == 'R') {
                    x = i;
                    y = j;
                    break;
                }
            }
        }
        int[] dx = new int[] { 0, 1, 0, -1 };
        int[] dy = new int[] { 1, 0, -1, 0 };
        for (int i = 0; i < 4; i++) {
            for (int step = 0;; step++) {
                int tx = x + step * dx[i];
                int ty = y + step * dy[i];
                if (tx < 0 || tx >= 8 || ty < 0 || ty >= 8 || board[tx][ty] == 'B') {
                    break;
                }
                if (board[tx][ty] == 'p') {
                    ans += 1;
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        _999zhs test = new _999zhs();
        System.out.println(test.numRookCaptures(
                new char[][] { { '.', '.', '.', '.', '.', '.', '.', '.' }, { '.', '.', '.', 'p', '.', '.', '.', '.' },
                        { '.', '.', '.', 'R', '.', '.', '.', 'p' }, { '.', '.', '.', '.', '.', '.', '.', '.' },
                        { '.', '.', '.', '.', '.', '.', '.', '.' }, { '.', '.', '.', 'p', '.', '.', '.', '.' },
                        { '.', '.', '.', '.', '.', '.', '.', '.' }, { '.', '.', '.', '.', '.', '.', '.', '.' } }));
        System.out.println(test.numRookCaptures(
                new char[][] { { '.', '.', '.', '.', '.', '.', '.', '.' }, { '.', '.', '.', 'p', '.', '.', '.', '.' },
                        { '.', '.', '.', 'R', '.', '.', '.', 'p' }, { '.', '.', '.', '.', '.', '.', '.', '.' },
                        { '.', '.', '.', '.', '.', '.', '.', '.' }, { '.', '.', '.', 'p', '.', '.', '.', '.' },
                        { '.', '.', '.', '.', '.', '.', '.', '.' }, { '.', '.', '.', '.', '.', '.', '.', '.' } }));
    }
}
