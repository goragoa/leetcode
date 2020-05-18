public class _152zhs {
    public int maxProduct(int[] nums) {
        int length = nums.length;
        int[] product = new int[length];
        int maxValue = nums[0];
        for (int i = 0; i < product.length; i++) {
            maxValue = Math.max(nums[i], maxValue);
        }
        for (int i = 0; i < product.length; i++) {
            product[i] = nums[i];
            for (int j = i + 1; j < product.length; j++) {
                product[j] = product[j - 1] * nums[j];
                maxValue = Math.max(product[j], maxValue);
            }
        }
        return maxValue;
    }

    public int maxProduct2(int[] nums) {
        int maxF = nums[0];
        int minF = nums[0];
        int maxValue = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int mx = maxF;
            int mn = minF;
            minF = Math.min(mn * nums[i], Math.min(nums[i], mx * nums[i]));
            maxF = Math.max(mx * nums[i], Math.max(nums[i], mn * nums[i]));
            maxValue = Math.max(maxValue,maxF);
        }
        return maxValue;
    }

    public static void main(String[] args) {
        _152zhs t = new _152zhs();
        System.out.println(t.maxProduct2(new int[] { -2, 0, -1 }));
        System.out.println(t.maxProduct2(new int[] { 2, 3, -2, 4 }));
    }
}