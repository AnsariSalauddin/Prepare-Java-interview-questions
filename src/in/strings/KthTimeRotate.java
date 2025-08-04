package in.strings;


import java.util.Arrays;

public class KthTimeRotate {

    public static int[] rotateArray(int[] arr, int k){
        int len=arr.length-1;
        k=k%arr.length;
        System.out.println("value of k:"+k);
        reverse(arr, 0, len);
        reverse(arr,0,k-1);
        reverse(arr,k,len);
        return arr;
    }
    public static void reverse(int[] arr,int start, int end){
        while (start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int array[]={1,2,3,4,5};
        int k=2;
//        kthRotate(array,k);
        int[] array1 = rotateArray(array, k);
        Arrays.stream(array1).forEach(System.out::print);
    }
}
