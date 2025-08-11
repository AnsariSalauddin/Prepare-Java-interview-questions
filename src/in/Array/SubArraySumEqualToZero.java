package in.Array;


public class SubArraySumEqualToZero {
    public static boolean subArraySumEqualToZero(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                    if (sum == 0) {
                        return true;
                    }
                }
            }
        }
        return false;

    }
    public static void printSubArray(int arr[]){
        for (int i=0; i<arr.length; i++){
            for (int j=i; j<arr.length; j++){
                for (int k=i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }


    public static void main(String[] args) {
//        int[] arr = {4, 2, -3, 1, 6};
//        boolean b = subArraySumEqualToZero(arr);
//        System.out.println(b);
        int[] n={1,2,3};
        printSubArray(n);
    }
}

