public class _136zhs {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int i : nums) {
            res ^= i;
        }
        return res;
    }

    public static void main(String[] args) {
        _136zhs t = new _136zhs();
        int[] nums = new int[] { 1, 2, 2 };
        System.out.println(t.singleNumber(nums));
    }
}