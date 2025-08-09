package in.Array;


import java.util.HashMap;
import java.util.HashSet;


public class FirstRepeatingElement {
    public static int firstRepeatingElement(int[] arr) {
        HashSet<Integer> hashSet = new HashSet<>();
        int repeatingElement = -1;
        for (Integer e : arr) {
            if (hashSet.contains(e)) {
                repeatingElement = e;
                break;
            } else {
                hashSet.add(e);
            }
        }
        return repeatingElement;
    }

    public static void firstNonRepeatingElement(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (Integer in : arr) {
            if (hashMap.containsKey(in)) {
                hashMap.put(in, hashMap.get(in) + 1);
            } else {
                hashMap.put(in, 1);
            }
        }
        for (Integer j : hashMap.keySet()) {
            if (hashMap.get(j) == 1) {
                System.out.println(j);
                break;
            }
        }



    }

    public static void main(String[] args) {

        int[] element ={10,5,3,4,3,5,6}; //{1, 2, 3, 4, 5, 5, 2, 1};
        System.out.println(firstRepeatingElement(element));
//        firstNonRepeatingElement(element);
    }
}

