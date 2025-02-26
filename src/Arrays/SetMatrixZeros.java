package Arrays;

import java.util.Arrays;
import java.util.ArrayList;

// MAKE EVERY ELEMENT IN ITS ROW AND COLUMN 0 IF ANY ELEMENT IS 0

public class SetMatrixZeros {
    public static void main(String[] args) {
        int [][] matrix = new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}};
            int m = matrix.length;
            int n = matrix[0].length;

            ArrayList<int[]> zeroIndexes = new ArrayList<>();

            for(int i = 0; i<m;i++){
                for(int j = 0; j<n; j++){

                    if(matrix[i][j]==0){
//                        ADDING ZERO CONTAINING INDEXES IN ARRAYLIST
                        zeroIndexes.add(new int[]{i,j});
                    }
                }
            }
            for(int[] arr : zeroIndexes){
//                MAKING ROW AND COLUMN ELEMENTS ZERO FOR EACH ZERO ELEMENT IN ZEROINDEXES ARRAY-LIST
                int i = arr[0];
                int j = arr[1];
                for(int x = 0; x<m; x++){
                    matrix[x][j]=0;
                }
                for(int y = 0; y<n; y++){
                    matrix[i][y]=0;
                }
            }
        System.out.println(Arrays.deepToString(matrix));
        }
    }
