package CodingQnBasic;

import java.util.Arrays;

public class RemoveDuplicateFromSorted {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,1,1,1,1,2,3,4,4,4,5,5};
        int uniqueVal = removeDuplicate(arr);
        for(int i = 0 ; i <= uniqueVal; i++){
            System.out.print(arr[i]+" ");
        }
    }
    private  static  int removeDuplicate(int[] arr){
        int first = 0;
        int second = 1;
        for(int i = 1 ; i < arr.length; i++){
            if(arr[first] != arr[second]){
                arr[++first] = arr[second];
            }
            second++;
        }
        return  first;
    }
}
