public class RotatedShortedArray {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int peak = findPeak(nums, target);

        if (peak==-1){
            System.out.println("there is no peak");
        }
        int targetIndex = BS(nums,target,0,peak);
        if (targetIndex==-1){
            targetIndex = BS(nums,target,peak+1,nums.length-1);
        }
        System.out.println(targetIndex);
    }

    public static int findPeak(int[] nums, int target) {

        int s = 0;
        int e = nums.length - 1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (m<e && nums[m] > nums[m + 1]) {
                return m;
            }
            if (m>s && nums[m] < nums[m - 1]) {
                return m - 1;
            }
            if (nums[s] > nums[m]) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return -1;
    }
     public static int BS(int[] nums, int target, int start, int end) {
        while(start<=end){

            int mid = start + (end-start)/2;

            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                end=mid-1;
            }else{
                start= mid+1;
            }
        }
        return -1;
     }
}