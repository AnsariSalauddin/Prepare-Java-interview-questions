package in.Array;



import java.util.Arrays;

public class RotateArray {
    public static void rotateArray(int[] arr){
       int i=0;
       int j=arr.length-1;
       while (i!=j){
           int temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
           i++;
       }
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        rotateArray(arr);
    }
}
