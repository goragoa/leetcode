/**
class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1; // 注意
        while(left <= right) { // 注意
            int mid = (left + right) / 2; // 注意
            if(nums[mid] == target) { // 注意
                // 相关逻辑
            } else if(nums[mid] < target) {
                left = mid + 1; // 注意
            } else {
                right = mid - 1; // 注意
            }
        }
        // 相关返回值
        return 0;
    }
}
**/

public class _35zhs {
    public int search(int[] nubs, int begin, int end, int target) {
        if (begin == end) {
            if (target <= nubs[begin]) {
                return begin;
            } else if (target > nubs[begin]) {
                return begin + 1;
            }
        }
        int middle = (begin + end) / 2;
        if (nubs[middle] == target) {
            return middle;
        } else if (nubs[middle] < target) {
            if (nubs[middle + 1] > target) {
                return middle + 1;
            }
            return search(nubs, middle+1, end, target);
        } else if (nubs[middle] > target) {
            if (nubs[middle - 1] < target) {
                return middle;
            }
            return search(nubs, begin, middle, target);
        }
        return 0;
    }

    public int searchInsert(int[] numb, int target) {
        if(target<numb[0]){
            return 0;
        }
        if(target>numb[numb.length-1]){
            return numb.length;
        }
        return search(numb, 0, numb.length - 1, target);
    }

    public static void main(String[] args) {
        _35zhs test = new _35zhs();
        System.out.println(test.searchInsert(new int[]{1, 3, 5, 6}, 2));
    }
}
