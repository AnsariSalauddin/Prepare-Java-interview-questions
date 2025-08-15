package in.leetCode2;


import java.util.HashMap;
import java.util.Set;

public class K_Diff_ValueInArray {
    public static int k_diffValue(int[] num, int k){
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int n: num){
            if(hm.containsKey(n)){
                hm.put(n,hm.get(n)+1);
            }else {
                hm.put(n,1);
            }

        }
        int count=0;
        Set<Integer> set = hm.keySet();
        for (Integer s:set){
            if(k>0 &&hm.containsKey(s+k)){
                count++;
            }
            if(k==0 && hm.get(s)>1){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] num={3,1,4,1,5};
        int k=2;
//        int[] num={1,2,3,4,5};
//        int k=1;
        int i = k_diffValue(num,k);
        System.out.println(i);
    }
}
