package CodingQnBasic;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Largest_Smallest_ele {
    public static void main(String[] args) {
        int[]  arr = {212,3423,1,2122233,1112,11,0,21133};
        System.out.println(Arrays.toString(largest_smallest(arr)));
    }
    private static int[] largest_smallest(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int j : arr) {
            max = Math.max(max, j);
            min = Math.min(min, j);
        }
        return  new int[]{min,max};
    }
}
