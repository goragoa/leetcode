public class _53ytt {
    public int maxSubArray(int[] nums) {//最大子序和
        int sum = nums[0];
        int ans = nums[0];
        for(int i=1;i<nums.length;i++){
            if(sum > 0){
                sum += nums[i];
            }
            else{
                sum = nums[i];
            }
            ans = Math.max(sum , ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        _53ytt test = new _53ytt();
        System.out.println(test.maxSubArray(nums));
    }
}
