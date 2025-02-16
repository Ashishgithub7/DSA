public class SplitArrayLargestSum {
//    Question number 410 at Leetcode
    public static void main(String [] args){
        int[] array = {7,2,5,10,8};
        int m = 2;

       int answer = FindMinimumMaxSum(array,m);
        System.out.println(answer);
    }
    public static int FindMinimumMaxSum(int[] array, int m){
        int low = 0;
        int high = 0;

        for(int i = 0 ; i < array.length ; i++){
          low = Math.max(low,array[i]);
          high = high + array[i];
        }

        while(low<high){
        int sum = 0;
        int pieces =1;
            int mid = low +(high-low)/2;
            for(int element : array){

                if(sum+element<=mid){
                    sum = sum + element;
                }else{
//                    can't add no more element in the subarray. So create next subarray
//                    and sum starts again with the rejected element
                    pieces++;
                    sum = element;
                }
            }
            if(pieces<=m){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}
