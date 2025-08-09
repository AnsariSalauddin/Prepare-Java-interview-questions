package in.Array;


import java.util.Arrays;

public class FindPair {
    public static void pair(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
//                System.out.println(arr[i]+" "+arr[j]);
                if (arr[i] + arr[j] == 0) {
                    System.out.println("(" + arr[i] + " " + arr[j] + ")");
                }
            }
        }
    }

    public static void findPairSumGreaterThanZero(int arr[]) {
        int count = 0;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] > 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] array = {-4, -1, 2, 3, 5};
        //pair(array);
        findPairSumGreaterThanZero(array);
    }
}

