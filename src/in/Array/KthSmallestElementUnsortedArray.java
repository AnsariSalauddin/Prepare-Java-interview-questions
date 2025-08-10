package in.Array;


public class KthSmallestElementUnsortedArray {
    public static void kthSmallestElementUnsortedArray(int[] arr, int k) {
        long l = System.currentTimeMillis();
        int min1 = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i < min1) {
                min1 = i;
            }
        }
        int cout = 0;
        int min = min1;
        while (true) {
            if (linear(min, arr)) {
                cout++;
                if (cout == k) {
                    System.out.println(min);
                    break;
                }
                min = min + 1;

            } else {
                min = min + 1;
            }

        }
        long l1 = System.currentTimeMillis();
        System.out.println(l1-l);

    }

    public static boolean linear(int n, int[] arr) {
        for (int j : arr) {
            if (n == j) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15,90,80,100};
        kthSmallestElementUnsortedArray(arr, 8 );

    }
}
