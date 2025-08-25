package in.leetProblem;


import java.util.HashMap;

public class DuplicateElement {
    public static boolean duplicate(int[] nums){
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i=0; i<nums.length; i++){
            if(hashMap.containsKey(nums[i])){
                //System.out.println(nums[i]);
                return true;
            }else {
                hashMap.put(nums[i],1);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,2,1};
        boolean duplicate = duplicate(arr);
        System.out.println(duplicate);

    }
}

