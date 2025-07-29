package Arrays;



import java.util.Arrays;

public class ProductOfArrayElementExceptSelf {
    public static int[] productOfArrayElementExceptSelf(int[] nums){
        int len=nums.length;
        int[] ans=new int[len];
        int prodL=1;
        int prodR=1;
        for (int i=len-1; i>=0; i--){
            ans[i]=prodR;
            prodR=prodR*nums[i];
        }
        for (int i=0; i<len;i++){
            ans[i]=ans[i]*prodL;
            prodL=prodL*nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int[] ints = productOfArrayElementExceptSelf(arr);
        System.out.println(Arrays.toString(ints));
    }
}
