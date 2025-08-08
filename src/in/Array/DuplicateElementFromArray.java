package in.Array;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateElementFromArray {
    public static void duplicateElementFromArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[Math.abs(arr[i])]>0){
                arr[Math.abs(arr[i])]=-arr[Math.abs(arr[i])];
            }else {
                System.out.println(Math.abs(arr[i]));
            }
        }

        Map<Integer, Long> collect = Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        Integer[] array = collect.keySet().stream().filter(x -> collect.get(x) >=2).toArray(Integer[]::new);
        for (Integer in:array){
            System.out.println(in);
        }



    }
    public static void removeDuplicateElementFromArray(int[] arr){
       //normal approach---
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    arr[j]=0;
                }
            }
        }
        for (Integer in:arr){
            if(in!=0){
                System.out.println(in);
            }
        }
        //using stream or java 8 feature
        Integer[] array = Arrays.stream(arr).distinct().boxed().toArray(x -> new Integer[x]);
        for (Integer integer:array){
            System.out.println(integer);
        }
    }

    public static void main(String[] args) {
        int[] arr={1,3,2,4,3,5,6,4,7,1};
        //removeDuplicateElementFromArray(arr);
        duplicateElementFromArray(arr);



    }
}
