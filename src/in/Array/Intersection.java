package in.Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Intersection {
    public static void intersection(int arr[], int arr1[]) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (Integer s : arr) {
            hashSet.add(s);
        }
        List<Integer> list = new ArrayList<>();

        for (Integer s : arr1) {
            if (hashSet.contains(s)) {
                list.add(s);
                hashSet.remove(s);
            }
        }
        list.forEach(System.out::println);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int arr1[] = {4, 5, 6, 7};
        intersection(arr, arr1);

    }
}
