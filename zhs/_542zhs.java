public class _542zhs {
    public int[][] updateMatrix(int[][] matrix) {
        if (matrix.length == 0)
            return new int[0][];
        if (matrix[0].length == 0)
            return new int[matrix.length][];
        int[][] distance = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < distance.length; i++) {
            for (int j = 0; j < distance[0].length; j++) {
                if (matrix[i][j] == 0) {
                    distance[i][j] = 0;
                } else {
                    distance[i][j] = 10000;
                }
            }
        }
        int count = matrix.length + matrix[0].length - 2;
        while (count != 0) {
            count--;
            for (int i = 0; i < distance.length; i++) {
                for (int j = 0; j < distance[0].length; j++) {
                    // up
                    if (i - 1 >= 0) {
                        distance[i][j] = Math.min(distance[i][j], distance[i - 1][j] + 1);
                    }
                    // down
                    if (i + 1 < distance.length) {
                        distance[i][j] = Math.min(distance[i][j], distance[i + 1][j] + 1);
                    }
                    // left
                    if (j - 1 >= 0) {
                        distance[i][j] = Math.min(distance[i][j], distance[i][j - 1] + 1);
                    }
                    if (j + 1 < distance[0].length) {
                        distance[i][j] = Math.min(distance[i][j], distance[i][j + 1] + 1);
                    }
                }
            }
        }
        return distance;
    }

    public static void main(String[] args) {
        _542zhs t = new _542zhs();
        System.out.println(t.updateMatrix(new int[][] { { 0, 0, 0 }, { 0, 1, 0 }, { 1, 1, 1 } }));
    }
}