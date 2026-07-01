package CodingQnBasic;

import java.util.Arrays;

public class SecondLargestEle {
    public static void main(String[] args) {
        int[] arr = {10,20,5,1000,58,855,36,1,6978,1007,90};
        System.out.println(Arrays.toString(secondLargestEle(arr)));
    }
    private  static  int[] secondLargestEle(int[] arr){
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                secMax  = max;
                max = arr[i];
            }else{
                if(arr[i] < max && arr[i] > secMax){
                    secMax = arr[i];
                }
            }
        }
        return  new int[]{max,secMax};
    }
}
