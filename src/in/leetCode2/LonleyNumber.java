package in.leetCode2;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LonleyNumber {

    public static List<Integer> lonleyNumber(int[] arr) {
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i : arr) {
            if (hm.containsKey(i)) {
                hm.put(i, hm.get(i) + 1);
            } else {
                hm.put(i, 1);
            }
        }
        for (int i : arr) {
            if (hm.get(i) == 1 && !hm.containsKey(i - 1) && !hm.containsKey(i + 1)) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 3};
        List<Integer> list = lonleyNumber(arr);
        System.out.println(list);
    }
}
