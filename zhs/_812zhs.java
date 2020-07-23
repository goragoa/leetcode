public class _812zhs {
    public double calArea(int[] a, int[] b, int[] c) {
        return Math.abs((a[0] * b[1] - a[0] * c[1] + b[0] * c[1] - b[0] * a[1] + c[0] * a[1] - c[0] * b[1]) / 2.0);
    }

    public double largestTriangleArea(int[][] points) {
        double largestArea = 0.0;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                for (int k = j + 1; k < points.length; k++) {
                    largestArea = Math.max(largestArea, calArea(points[i], points[j], points[k]));
                }
            }
        }
        return largestArea;
    }

    public static void main(String[] args) {
        _812zhs test = new _812zhs();
        int[][] points = new int[][] { { 0, 0 }, { 0, 1 }, { 1, 0 }, { 0, 2 }, { 2, 0 } };
        System.out.println(test.largestTriangleArea(points));
    }
}
