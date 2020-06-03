package _20;

public class _27zhs {
    public int removeElement(int[] nums, int val) {
        int slowPointer = -1;
        for (int fastPointer = 0; fastPointer < nums.length; fastPointer++) {
            if (nums[fastPointer] != val) {
                nums[++slowPointer] = nums[fastPointer];
            }
        }
        return slowPointer + 1;
    }

    public static void main(String[] args) {
        _27zhs test = new _27zhs();
        int len = test.removeElement(new int[]{3,3,2,2},3);
        System.out.println(len);
    }
}
