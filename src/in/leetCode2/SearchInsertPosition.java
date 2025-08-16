package in.leetCode2;

public class SearchInsertPosition {
    public static int searchInsertPosition(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int[] nums={1,3,5,6};
//        int target=5;
//        int target=2;
        int target=7;
        int i = searchInsertPosition(nums, target);
        System.out.println(i);

    }
}
