package _10;

/**
 * @author zhangshuo
 * @Description
 * @date 2020/8/10 20:21
 */
public class j11_zhs {
    public static int minArray(int[] numbers) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int mid = (i + j) / 2;
            if (numbers[j] < numbers[mid]) {
                i = mid + 1;
            } else if (numbers[j] > numbers[mid]) {
                j = mid;
            } else {
                j--;
            }
        }
        return numbers[i];
    }

    public static void main(String[] args) {
        System.out.println(minArray(new int[]{3, 1}));
    }
}
