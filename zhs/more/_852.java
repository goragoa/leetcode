package more;

/**
 * @author
 * @Description
 * @date 8/17/2020 8:52 PM
 */
public class _852 {
    public static int peakIndexInMountainArray(int[] A) {
        int a = 0, b = A.length - 1;
        while (a != b) {
            int mid = (a + b) / 2;
            if ((mid == 0 || A[mid] > A[mid - 1]) && (mid == A.length - 1 || A[mid] > A[mid + 1])) {
                return mid;
            } else if ((mid == 0 || A[mid] > A[mid - 1]) && A[mid] < A[mid + 1]) {
                a = mid + 1;
            } else {
                b = mid;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(peakIndexInMountainArray(new int[]{3, 4, 5, 1}));
    }
}
