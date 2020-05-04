import java.util.Arrays;

public class _26zhs {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums.length == 1)
            return nums.length;
        int slow = 0, fast = 1;
        while (fast < nums.length) {
            if (nums[fast] > nums[slow]) {
                nums[++slow] = nums[fast];
            }
            fast++;
        }
        return ++slow;
    }

    public static void main(String[] args) {
        _26zhs t = new _26zhs();
        int[] v = new int[] { 1, 1, 2 };
        System.out.println(t.removeDuplicates(v));
        System.out.println(Arrays.toString(v));
    }
}
