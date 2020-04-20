import java.util.Arrays;
import java.util.HashMap;

//两数之和
class _1{
    public int[] twoSum(final int[] nums, final int target) {
        final int[] indexs = new int[2];
        final HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (!hash.containsKey(target - nums[i])) {
                hash.put(nums[i], i);
            } else {
                indexs[0] = i;
                indexs[1] = hash.get(target - nums[i]);
                break;
            }
        }
        return indexs;
    }

    public static void main(String args[]) {
        final _1 t = new _1();
        int[] a = t.twoSum(new int[]{2,7,11,15}, 9);
        System.out.println(Arrays.toString(a));
    }
}