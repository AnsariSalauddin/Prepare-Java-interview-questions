package in.Array;



import java.util.Arrays;
import java.util.Comparator;

public class SortArrayUsingSecondArray {
    public static void sortingArrayUsingSecondArray(int[] arr, String[] arr1) {
        String[][] temp = new String[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            temp[i][0] = String.valueOf(arr[i]);
            temp[i][1] = arr1[i];

        }
       Arrays.sort(temp, Comparator.comparingInt( a->Integer.parseInt(a[0])));
        for (int i=0; i<temp.length; i++){
            System.out.print(temp[i][1]+" ");
        }
    }


    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 2, 2, 0, 1};
        String[] arr1 = {"a", "b", "c", "d", "e", "f", "g", "h", "i"};
        sortingArrayUsingSecondArray(arr, arr1);

    }
}

