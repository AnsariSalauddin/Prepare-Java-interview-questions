package in.leetCode2;

import java.util.HashMap;

public class LuckyNumber {
    public static int luckyNumber(int[] num){
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int nu:num){
            if(hashMap.containsKey(nu)){
                hashMap.put(nu,hashMap.get(nu)+1);
            }else {
                hashMap.put(nu,1);
            }
        }
        int max=-1;
        for (int nu:num){
            if(hashMap.get(nu)==nu){
                max=Math.max(max,hashMap.get(nu));
            }
        }
        return  max;
    }
    public static void main(String[] args) {
//            int[] num={2,2,3,4};
        int[] num={1,2,2,3,3,3};
        int i = luckyNumber(num);
        System.out.println(i);

    }
}
