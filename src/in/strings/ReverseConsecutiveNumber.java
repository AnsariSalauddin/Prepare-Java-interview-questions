package in.strings;


public class ReverseConsecutiveNumber {
    public static void consecutiveNumberReverse(int[] arr) {
        int start = 0;
        for (int i = 1; i <= arr.length; i++) {
            if (i == arr.length || arr[i - 1] + 1 != arr[i]) {
                int end = i - 1;
                reverseFuction(arr, end, start);
                start = i;
            }
        }
        for (int in : arr) {
            System.out.print(in + " ");
        }
    }

    public static void reverseFuction(int[] arr, int end, int start) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
//        int[] arr = {2, 3, 4, 7, 1, 8, 9};
        int[] arr = {2, 7, 4, 5, 6, 7, 8, 9};
        consecutiveNumberReverse(arr);
    }
}


