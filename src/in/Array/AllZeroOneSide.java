package in.Array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.IntStream;

public class AllZeroOneSide {
    public static void printAllZeroOneSide(int[] arr) {

        int res[] = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                res[j] = arr[i];
                j++;
            }

        }
        for (int ii:res){
            System.out.println(ii+" ");
        }
        
//        IntStream.concat(
//                 Arrays.stream(arr).filter(x->x!=0),
//                 Arrays.stream(arr).filter(x->x==0)
//         ).forEach(System.out::println);
   }

    public static void main(String[] args) {
        int zero[] = {1, 2, 0, 4, 0, 0, 6, 2, 0};
        printAllZeroOneSide(zero);

    }
}

