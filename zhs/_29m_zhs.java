import java.util.Arrays;

public class _29m_zhs {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0)
            return new int[] { 0 };
        int l = 0, r = matrix[0].length - 1, t = 0, b = matrix.length - 1, x = 0;
        int[] res = new int[(r + 1) * (b + 1)];
        while (true) {
            for (int i = l; i <= r; i++) {
                res[x++] = matrix[t][i];
            }
            if (++t > b)
                break;
            for (int i = t; i <= b; i++) {
                res[x++] = matrix[i][r];
            }
            if (l > --r)
                break;
            for (int i = r; i >= l; i--)
                res[x++] = matrix[b][i]; // right to left.
            if (t > --b)
                break;

            for (int i = b; i >= t; i--) {
                res[x++] = matrix[i][l];
            }
            if (++l > r)
                break;
        }
        return res;
    }

    public static void main(String[] args) {
        _29m_zhs t = new _29m_zhs();
        System.out.println(Arrays.toString(t.spiralOrder(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } })));
    }
}
