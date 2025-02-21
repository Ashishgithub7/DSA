package Arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralArray {

    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        List<Integer> ans = makeSpiral(matrix);
        System.out.println(ans);
    }

    public  static List<Integer> makeSpiral(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        int rs = 0;
        int cs = 0;
        int re = m - 1;
        int ce = n - 1;

        while(ans.size()<m*n){
            for(int i = cs; i <= ce; i++){
                ans.add(matrix[rs][i]);
            if(ans.size()>=m*n){
                return ans;
            }
            } rs ++;

            for(int i = rs ; i <= re; i++ ){
                ans.add(matrix[i][ce]);
                if(ans.size()>=m*n){
                    return ans;
                }
            } ce --;

            for(int i = ce; i >= cs; i--){
                ans.add(matrix[re][i]);
                if(ans.size()>=m*n){
                    return ans;
                }
            } re --;

            for (int i = re; i>= rs; i--){
                ans.add(matrix[i][cs]);
                if(ans.size()>=m*n){
                    return ans;
                }
            } cs ++;
        }
        return ans;
    }
}
