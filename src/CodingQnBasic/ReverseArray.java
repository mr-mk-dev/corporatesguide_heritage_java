package CodingQnBasic;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {112,44,5,121,11,3};
        revArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void revArray(int[] arr){
        int start = 0 , end = arr.length-1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
