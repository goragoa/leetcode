package _40;

import java.util.Arrays;

/**
 * @author zhangshuo
 * @Description leetcode
 * @date 2020/8/10 20:01
 */
public class j40_zhs {
    public static int[] getLeastNumbers(int[] arr, int k) {
         Arrays.sort(arr);
         return Arrays.copyOfRange(arr, 0, k);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,2,1};
        System.out.println(Arrays.toString(getLeastNumbers(arr, 2)));
    }
}
