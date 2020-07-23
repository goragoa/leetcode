public class _35ytt {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int mid = 0;
        while (left <= right){
            mid = (left+right)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        _35ytt test = new _35ytt();
        int[] nums = {1,3,5,6};
        int target = 5;
        System.out.println(test.searchInsert(nums, target));
    }
}
