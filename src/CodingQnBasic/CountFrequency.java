package CodingQnBasic;

import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,0,4,1,3,5,2,4,0,0,5,1,0,0,0,0,7,0,0,0,1,0};
        Map<Integer,Integer> map = frequencyCount(arr);
        for(Map.Entry<Integer,Integer> val : map.entrySet()){
            System.out.println(val.getKey() + " -> " + val.getValue());
        }

    }
    public static Map<Integer,Integer> frequencyCount(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        for(int key : arr){
            map.put(key,map.getOrDefault(key,0)+1);
        }
        return  map;
    }
}
