package in.strings;


public class RemoveDuplicatesFromSortedArrayII {
    public static int removeDuplicateSortedArrayII(int[] num){
        int i=0;
        for (int n:num){
            if(i<2 || n!=num[i-2]){
                num[i++]=n;
            }
        }
        for (int ii:num){
            System.out.print(ii+" ");
        }
        return i;
    }
    public static void main(String[] args) {
        int[] nums={1,1,1,2,2,3};
        int i = removeDuplicateSortedArrayII(nums);
//        System.out.print(i+" ");
    }
}
