package Arrays;

import java.util.Arrays;

public class ArrayFromPermutation {
    public static void main(String[] args) {
        int[] arr = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(Set(arr)));
    }

    public static int[] Set(int[] arr) {
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {

            ans[i]=arr[arr[i]];
//          ELEMENT AT INDEX i TELLS ELEMENT FROM WHICH INDEX SHOULD BE THERE
//          FOR EXAMPLE 5 AT INDEX 3 TELLS THAT ELEMENT FROM INDEX 5 SHOULD BE THERE AT INDEX 3
//          ie FOR I => ARR[ARR[I]]
        }
        return ans;
    }
}
