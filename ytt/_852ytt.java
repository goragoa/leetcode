public class _852ytt {
    public int peakIndexInMountainArray(int[] A) {
//        for(int i=0 ; i < A.length-1 ; i++){
//            if(A[i+1] < A[i])
//                return i;
//        }
//        return 0;
        int left = 0;
        int right = A.length-1;
        while(left <= right){
            int mid = (left+right)/2;
            if(A[mid]>A[mid+1] && A[mid]>A[mid-1]){
                return mid;
            }
            else if(A[mid]>A[mid+1]){
                right = mid -1;
            }
            else{
                left = mid + 1;
            }
        }
        return 0;
    }
}
