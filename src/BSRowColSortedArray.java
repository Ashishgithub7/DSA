import java.util.Arrays;
import java.util.Scanner;

public class BSRowColSortedArray {
    public static void main(String [] args){

        int [][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,38,49},
                {33,34,39,50}
        };
        int target = 69;

        int [] result = findResult(arr,target);
        System.out.println(Arrays.toString(result));
    }
    public static int [] findResult(int[][] arr,int target){
        int r = 0;
        int c = arr.length-1;
//        if matrix not N*N c = arr[0].length - 1

        while(r < arr.length && c >= 0){

            if(arr[r][c] == target){
                return new int [] {r,c} ;
            }else if(arr[r][c] < target){
                r++;
            }else{
                c--;
            }
        }
        return new int []{-1,-1};
    }
}
