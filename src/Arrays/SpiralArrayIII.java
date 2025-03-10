package Arrays;
import java.util.Arrays;


public class SpiralArrayIII {
    public static void main(String[] args) {

        SolveSpiral3(5,6,1,4);

    }
    public static void SolveSpiral3(int rows, int cols, int rStart, int cStart ) {

        int[][] matrix = new int[rows][cols];
        int totalElements = rows*cols;
        int[][] ans = new int[totalElements][2];
        int times = 1;
        int element = 1;
        String op = "+";

            int row = 0;
//      FOR FIRST ELEMENT 1
            matrix[rStart][cStart] = element;
            ans[row]= new int[]{rStart, cStart};
            element++;
            row++;
            cStart++;

        while(element <= totalElements){

//            FOR ROWS CHANGE
            for(int i = 0 ; i < times ; i++){
//                if(c<cols && cols>=0 &&  r<rows && rows>=0)
                    if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols){
                    matrix[rStart][cStart] = element;
                    ans[row]= new int[]{rStart, cStart};
                    element++; /* increment matrix element value */
                    row++;  /* increment rows in answer array */
                }
                rStart = (op.equals("+")) ? rStart + 1 : rStart - 1; /* shift row */
            }
            times++;
            op = (op.equals("+")) ? "-" : "+";

//            FOR COLUMN ADD ELEMENT AND SHIFT
            for(int i = 0 ; i < times ; i++){
                if(rStart<rows && rStart>=0 &&  cStart<cols && cStart>=0){
                   matrix[rStart][cStart] = element;
                   ans[row]= new int[]{rStart, cStart};
                   element++; /* increment matrix element value */
                   row++;  /* increment rows in answer array */
                }
                cStart = (op.equals("+")) ? cStart + 1 : cStart - 1; /* shift column */
            }
        }
        System.out.println(Arrays.deepToString(ans));

    }
}
