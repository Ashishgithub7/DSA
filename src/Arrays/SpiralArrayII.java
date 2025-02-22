package Arrays;

import java.util.Arrays;

public class SpiralArrayII {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(generateMatrix(3)));

    }

            public static int[][] generateMatrix(int n) {

                int [][] ans = new int[n][n];
                int rs = 0;
                int cs = 0;
                int re = n-1;
                int ce = n - 1;
                int totalElements = n*n;
                int x = 1;

                while(x<=totalElements){

                    for(int i = cs; i <= ce; i++){
                        if(x>totalElements){
                            return ans;
                        }
                        ans[rs][i] = x ;
                        x++;
                    } rs ++;

                    for(int i = rs ; i <= re; i++ ){
                        if(x>totalElements){
                            return ans;
                        }
                        ans[i][ce] = x ;
                        x++;
                    } ce --;

                    for(int i = ce; i >= cs; i--){
                        if(x>totalElements){
                            return ans;
                        }
                        ans[re][i] = x;
                        x++;
                    } re --;

                    for (int i = re; i>= rs; i--){
                        if(x>totalElements){
                            return ans;
                        }
                        ans[i][cs] = x;
                        x++;
                    } cs ++;
                }

                return ans;
            }
        }
