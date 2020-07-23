public class _26ytt {
    public int removeDuplicates(int[] nums) {
        int index = 1;
        for(int i=1 ; i<nums.length ;i++){
            if(nums[i] != nums[i-1]){
                nums[index] = nums[i];
                index ++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        _26ytt test = new _26ytt();
        int[] nums = new int []{1,1,2};
        System.out.println(test.removeDuplicates(nums));
    }
}
