package Searching;

import java.util.Arrays;

public class Sorted2DArraySearch {

    public static void main(String[] args) {

        int [][] matrix = {{1,2,3},
                           {4,5,6},
                           {7,8,9}};

        int target = 9;

        System.out.println(Arrays.toString(search(matrix,target)));
    }
    public static int[] BS(int [][] arr, int target, int row , int cStart, int cEnd){
        while (cStart<=cEnd){
             int mid = cStart +(cEnd-cStart)/2;

             if(arr[row][mid]==target){
                 return new int [] {row,mid};
             }
             if(arr[row][mid]<target){
                 cStart = mid + 1;
             }else{
                 cEnd = mid - 1;
             }

        }
        return new int [] {-1,-1};
    }

    static int [] search (int [][] arr, int target){
        int rows = arr.length;
        int cols = arr[0].length;

        if (rows==1){
            return BS(arr,target,0,0,cols - 1);
        }

        int rStart = 0;
        int rEnd = rows-1;
        int cMid = cols/2;

        while( rStart < (rEnd - 1)){

            int rMid = rStart + (rEnd-rStart)/2;

            if(arr[rMid][cMid]==target){
                return new int [] {rMid,cMid};
            }
            if(arr[rMid][cMid]<target){
                rStart = rMid;
            }else{
                rEnd = rMid;
            }
        }

//        NOW WE GET TWO ROWS AT LAST  [1,2,3,4]
//                                     [5.6,7,8]

//        CHECK WHETHER THE TARGET IS AT MID COLUMN  2 & 6

          if(arr[rStart][cMid]==target){
              return new int [] {rStart,cMid};
          }else if(arr[rStart + 1 ][cMid] == target){
              return new int [] {rStart + 1,cMid};
          }

//          NOW CHECKING FOR TARGET IN FIRST PART ie. 1 HERE
        if(target <= arr[rStart][cMid - 1]){
            return BS(arr, target, rStart, 0, cMid - 1);
        }

//          NOW CHECKING FOR TARGET IN SECOND PART ie. 7,8  HERE
        if(target >= arr[rStart][cMid + 1] &&  target <= arr[rStart][cols - 1]){
           return BS(arr, target, rStart, cMid + 1, cols - 1 );
        }

//          NOW CHECKING FOR TARGET IN THIRD PART ie. 9 HERE
        if(target <= arr[rStart + 1][cMid - 1]){
           return BS(arr, target, rStart + 1, 0, cMid - 1);
        }else{
            return  BS(arr, target, rStart + 1, cMid +  1, cols - 1);
        }
//        LAST PART ie 11,12
    }
}
