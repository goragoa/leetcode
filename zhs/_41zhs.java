public class _41zhs {
    public int firstMissingPositive(int[] nums) {
        int[] counts = new int[nums.length + 2];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0 || nums[i] >= counts.length) {
                counts[0]++;
            }
            counts[nums[i]]++;
        }
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] == 0) return i;
        }
        return 0;
    }
}
