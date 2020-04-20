
public class _53zhs {
    public int maxSubArray(int[] nums) {
        int maxSum = 0;
        int tmp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(tmp<0){
                tmp=0;
            }
            tmp = tmp+nums[i];
            maxSum = Math.max(maxSum,tmp);
        }
        return maxSum;
    }

    public int crossSum(int[] nums, int left, int right, int p){
        if(left==right){
            return nums[left];
        }
        int leftSubsum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i = p;i>left-1;--i){
            currSum+=nums[i];
            leftSubsum = Math.max(leftSubsum,currSum);
        }

        int rightSubSum = Integer.MIN_VALUE;
        currSum = 0;
        for(int i=p+1;i<right+1;++i){
            currSum +=nums[i];
            rightSubSum = Math.max(rightSubSum,currSum);
        }
        return leftSubsum+rightSubSum;
    }
    public int helper(int[] nums, int left, int right){
        if(left==right){
            return nums[left];
        }
        int p = (left+right)/2;
        int leftSum = helper(nums, left, p);
        int rightSum = helper(nums,p+1,right);
        int crossSum = crossSum(nums, left, right, p);
        return Math.max(Math.max(leftSum,rightSum),crossSum);
    }
    public int maxSubArray2(int[] nums) {
        return helper(nums,0,nums.length-1);
    }
    public static void main(String args[]){
        _53zhs test = new _53zhs();
        System.out.print(test.maxSubArray2(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}