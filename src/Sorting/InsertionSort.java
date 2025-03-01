package Sorting;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] nums = {2,8,9,3,6,10,-1,0,6,0};
        System.out.println(Arrays.toString(IS(nums)));
    }

    public static int[] IS(int[] nums) {

        for(int i = 0; i < nums.length - 1; i++) { /* i is used to tell j which number to sort after each Pass */
            for(int j = i + 1; j > 0; j--) { /* j starts from i+1, and shift left with the number if swapped for further checking upto index 1 */
                if(nums[j] < nums[j - 1]) {
                    swap(nums,j,j-1);
                }else break; /* if number at j > number at j-1, no further checking, as other at left are smaller as already sorted */
            }
        }
        return nums;
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
