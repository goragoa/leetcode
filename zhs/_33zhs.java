public class _33zhs {
    public int search(int[] nums, int target) {
        int len = nums.length;
        if (len == 0) {
            return -1;
        }
        return search(nums, 0, len - 1, target);
    }

    private int search(int[] nums, int left, int right, int target) {
        if (left == right && nums[left] == target) {
            return left;
        } else if (left == right) {
            return -1;
        }
        int mid = left + (right - left) / 2;

        if (target > nums[mid] && target <= nums[right]) {
            return search(nums, mid + 1, right, target);
        } else if (target >= nums[left] && target <= nums[mid]) {
            return search(nums, left, mid, target);
        } else if (nums[mid] < nums[right]) {
            return search(nums, left, mid, target);
        } else {
            return search(nums, mid + 1, right, target);
        }

    }

    public static void main(String[] args) {
        _33zhs test = new _33zhs();
        System.out.println(test.search(new int[]{5, 1, 3}, 5));
    }
}
