package main.zero;

/**
 * @author zhangshuo
 * @date 2020/11/16
 */
public class MedianofTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int m = nums1.length, i;
        int n = nums2.length, j;
        int left = 0, right = m;
        int maxLeft = 0, minRight = 0;
        while (left <= right) {
            i = (left + right) / 2;
            j = (m + n + 1) / 2 - i;
            int numsIm1 = (i == 0 ? Integer.MIN_VALUE : nums1[i - 1]);
            int numsI = (i == m ? Integer.MAX_VALUE : nums1[i]);
            int numsJm1 = (j == 0 ? Integer.MIN_VALUE : nums2[j - 1]);
            int numsJ = (j == n ? Integer.MAX_VALUE : nums2[j]);

            if (numsIm1 <= numsJ) {
                maxLeft = Math.max(numsIm1, numsJm1);
                minRight = Math.min(numsI, numsJ);
                left = i + 1;
            } else {
                right = i - 1;
            }
        }
        return (m + n) % 2 == 0 ? (maxLeft + minRight) / 2.0 : maxLeft;
    }
}
