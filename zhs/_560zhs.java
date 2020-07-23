import java.util.HashMap;

public class _560zhs {
    public int subarraySum(int[] nums, int k) {
        int a = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                a = a + nums[j];
                if (a == k) {
                    count += 1;
                }
            }
            a = 0;
        }
        return count;
    }

    public int subarraySum2(int[] nums, int k) {
        if (nums.length == 0)
            return 0;
        HashMap<Integer,Integer> m = new HashMap<>();
        int pre = 0;
        int count = 0;
        m.put(0,1);
        for (int i = 0; i < nums.length; i++) {
            pre+=nums[i];
            count+=m.getOrDefault(pre-k, 0);
            m.put(pre,m.getOrDefault(pre, 0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        _560zhs t = new _560zhs();
        System.out.println(t.subarraySum2(new int[] { 0,0,0,0,0,0,0,0,0,0 }, 0));
    }
}