public class _1266zhs {
    public int minTimeTwoPoint(int[] a,int[] b){
        int x = Math.abs(a[0]-b[0]);
        int y = Math.abs(a[1]-b[1]);
        return Math.max(x,y);
    }
    public int minTimeToVisitAllPoints(int[][] points) {
        int ans = 0;
        for (int i = 0; i < points.length - 1; i++) {
            ans+=minTimeTwoPoint(points[i],points[i+1]);
        }
        return ans;
    }

    public static void main(String[] args) {
        _1266zhs test = new _1266zhs();
        System.out.println(test.minTimeToVisitAllPoints(new int[][]{{1,1},{3,4},{-1,0}}));
    }
}
