package _30;

/**
 * @author
 * @Description
 * @date 2020/8/11 13:29
 */
public class j39_zhs {
    public static int majorityElement(int[] nums) {
        int max = 0, count = 0;
        for (int num :
                nums) {
            if (count == 0) {
                max = num;
                count++;
            } else if (max != num) {
                count--;
            } else {
                count++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{1, 2, 3, 2, 2, 2, 5, 4, 2}));
    }
}
