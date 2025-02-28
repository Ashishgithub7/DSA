package Arrays;

public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {3,2,1,0,4};

//
        System.out.println(check(nums));
    }
    public static boolean check(int[] nums){
        int max  = 0;

        for(int i = 0; i< nums.length; i++){

            if(i>max) return false;
            if(max<=i){
               max+=nums[max];
            }
            if(i+nums[i]>max){
                max = i + nums[i];
            }
    }
       return true;
    }
}
