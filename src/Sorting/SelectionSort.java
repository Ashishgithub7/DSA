package Sorting;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] nums = {2,8,9,3,6,10,-1,0,6,0};
        System.out.println(Arrays.toString(SS(nums)));
    }
    public static int [] SS(int[] nums) {
        for(int i=0; i<nums.length;i++){
            int max = findMax(nums,0,nums.length-i);

            int temp = nums[nums.length-1-i];
            nums[nums.length-1-i] = nums[max];
            nums[max]= temp;

        }
        return nums;
    }
    public static int findMax(int [] nums,int i,int n){
            int ans = i;
        for(int j=i+1; j<n;j++){
          if(nums[j]>nums[ans]){
              ans = j;
          }
        }
        return ans;
    }
}
