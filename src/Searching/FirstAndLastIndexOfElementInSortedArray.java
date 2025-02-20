package Searching;

import java.util.Arrays;

public class FirstAndLastIndexOfElementInSortedArray {
    public static void main(String[] args) {
        int [] arr = {5,7,7,8,8,10};
        int target = 8;

        System.out.println(Arrays.toString(Search(arr,target)));
    }
    public static int [] Search(int[] arr,int target){
        int fIndex = BSearch(arr, target, true);
        int lIndex = BSearch(arr, target, false);
        return new int []{fIndex, lIndex};
         }

         public static int BSearch(int [] arr,int target, boolean isFirstIndex){

             int start = 0;
             int end = arr.length - 1;
             int pAns = -1;

             while(start <= end){
                 int mid = start + (end -start)/2;

                 if(arr[mid]==target){
                     pAns = mid;
                     if(isFirstIndex){
                         end = mid- 1;
                     }else{
                         start =  mid + 1;

                     }
                 }else if(arr[mid]>target){
                     end = mid- 1;
                 }else{
                     start = mid +1 ;
                 }
             }
             return pAns;
         }
    }

