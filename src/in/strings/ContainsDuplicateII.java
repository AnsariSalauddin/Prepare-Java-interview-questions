
package in.strings;
import java.util.HashMap;

public class ContainsDuplicateII {
    public static boolean containDuplicate(int[] num, int k){
        HashMap<Integer, Integer> hashMap=new HashMap<>();
        for (int i=0;i<num.length; i++){
            int val=num[i];
            if(hashMap.containsKey(val) && i-hashMap.get(val)<=k){
                return true;
            }
            hashMap.put(val,i);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,0,1,1};
        int k = 1;
        boolean b = containDuplicate(nums, k);
        System.out.println(b);
    }
}
