package in.leetProblem;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[]arr,int target){
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i=0; i<arr.length; i++){
            int req_num=target-arr[i];
            if(hashMap.containsKey(req_num)){
                return new int[]{hashMap.get(req_num),i};
            }
            hashMap.put(arr[i],i);
        }
        return null;
    }
    public static void main(String[] args) {
        int[] arr={3,2,4};
        int target=7;
        int[] ints = twoSum(arr, target);
        System.out.println(Arrays.toString(ints));



    }
}
