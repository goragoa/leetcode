public class _11zhs {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int ans = 0;
        while (l < r) {
            int area = Math.min(height[l], height[r]) * (r - l);
            ans = Math.max(ans, area);
            if (height[l] <= height[r]) {
                l += 1;
            } else {
                r -= 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        _11zhs test = new _11zhs();
        System.out.println(test.maxArea(new int[]{10, 14, 10, 4, 10, 2, 6, 1, 6, 12}));
    }
}
