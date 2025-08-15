package in.leetCode2;



public class FindNonRepeatedElementInArray {
    public static int nonRepeatedElement(int[] nums){
        int singalVal=0;
        for (int i=0; i<nums.length; i++){
            singalVal^=nums[i];
        }
        return singalVal;
    }
    public static void main(String[] args) {
        int[] arr={1,1,2,3,3,4,4,8,8};
        int i = nonRepeatedElement(arr);
        System.out.println(i);
    }
}

