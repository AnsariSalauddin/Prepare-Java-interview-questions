package in.Array;



import java.util.Arrays;
import java.util.HashSet;

public class Union {
    public static void  printUnion(int[] arr, int[] arr1){
        HashSet<Integer> hashSet=new HashSet<>();
        for (int i=0; i<arr.length;i++){
            hashSet.add(arr[i]);
        }
        for (int j=0; j<arr1.length;j++){
            hashSet.add(arr1[j]);
        }
        hashSet.forEach(System.out::println);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int arr1[]={4,5,6,7,8};
        printUnion(arr,arr1);

    }
}

