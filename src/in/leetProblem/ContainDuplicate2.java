package in.leetProblem;


import java.util.HashMap;
import java.util.Map;

public class ContainDuplicate2 {
    public static boolean containDuplicate(int[] nums,int k){
        Map<Integer,Integer> mp=new HashMap<>();
        for (int i=0; i<nums.length; i++){
            if(!mp.containsKey(nums[i])){
                mp.put(nums[i],i);
            }else {
                int pastKey=mp.get(nums[i]);
                if(Math.abs(pastKey-i)<=k){
                    return true;
                }else {
                    mp.put(nums[i],i);
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nu={1,0,1,1};
        int k=1;
        boolean b = containDuplicate(nu, k);
        System.out.println(b);

    }
}

