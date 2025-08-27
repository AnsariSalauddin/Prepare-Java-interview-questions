package in.leetProblem;

public class MissingNumber {
    public static int missingNumber(int[] nums){
        int sum=0;
        for (int i=0; i<nums.length; i++){
            sum+=nums[i];
        }
        int actSum=(nums.length*(nums.length+1))/2;
        return actSum-sum;
    }
    public static void main(String[] args) {
        int[] arr={0,1,2,4,5};
        System.out.println(missingNumber(arr));

    }
}
