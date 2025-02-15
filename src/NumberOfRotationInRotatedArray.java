public class NumberOfRotationInRotatedArray {
    public static void main(String[] args) {
        int[] nums = {1};
        int target = 1;
        int peak = findPeakDuplicated(nums, target);
        System.out.println(peak+1);
    }
//for unique array
    public static int findPeak(int[] nums, int target) {
         int s= 0;
         int e = nums.length-1;

         while(s<=e){
             int mid = (s+e)/2;
             if (mid<e && nums[mid] > nums[mid + 1]) {
                 return mid;
             }
             if (mid>s && nums[mid] < nums[mid - 1]) {
                 return mid - 1;
             }
             if (nums[s] > nums[mid]) {
                 e = mid - 1;
             } else {
                 s = mid + 1;
             }
         }
             return -1;
    }

//for duplicated array
    public static int findPeakDuplicated(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = (start+end)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }

            if(nums[start]==nums[mid] && nums[mid]==nums[end]){
                if(start<end && nums[start]>nums[start+1]){
                    return start;
                }
                start++;
                if(end > start && nums[end]<nums[end-1]){
                    return end-1;
                }
                end--;
            }else if(nums[start]<nums[mid] || nums[start]==nums[mid]&&nums[mid]>nums[end]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}
