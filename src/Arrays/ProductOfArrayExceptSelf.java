package Arrays;
import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        int [] prefixArray =  new int[nums.length];
        int [] postfixArray =  new int[nums.length];
        findPrefixPostfix(nums,prefixArray,postfixArray);
        System.out.println("Prefix Array :" +Arrays.toString(prefixArray));
        System.out.println("Postfix Array :" +Arrays.toString(postfixArray));

        int [] ans = new int[nums.length];
        solveAnswer(nums,prefixArray,postfixArray,ans);
        System.out.println("Final Array: "+Arrays.toString(ans));
    }
    public static void findPrefixPostfix(int[] nums,int[] prefixArray,int[] postfixArray){
//      for prefix
        prefixArray[0] = nums[0];
        int preProduct = nums[0];
        for(int i = 1; i<nums.length; i++){
            preProduct = preProduct * nums[i];
            prefixArray[i] = preProduct;
        }

//        FOR POSTFIX ARRAY
        postfixArray[nums.length-1] = nums[nums.length-1];
        int postProduct = nums[nums.length-1];
        for(int i = nums.length-2; i>=0; i--){
            postProduct = postProduct * nums[i];
            postfixArray[i] = postProduct;
        }

    }

    public static void solveAnswer(int[] nums,int[] prefixArray,int[] postfixArray,int[] ans){
            ans[0] = postfixArray[1];
            ans[nums.length-1] = prefixArray[nums.length-2];

        for(int j=1; j<nums.length-1; j++){
            ans[j] = prefixArray[j-1]*postfixArray[j+1];
        }
    }
}
