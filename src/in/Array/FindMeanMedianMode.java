package in.Array;


import java.util.Arrays;

public class FindMeanMedianMode {
    public static void findMean(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum / arr.length);
    }

    public static void findMedian(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        if (n % 2 != 0) {
            int m = (n  / 2);
            System.out.println(arr[m]);
        } else {
            int m=arr[(n/2)]+arr[(n/2)-1];
            System.out.println(m/2);
        }
    }

    public static void findMode(int[] arr){
        int n=arr.length;
        int maxEl=0;
        int mode=0;
        for (int i=0;i<n;i++){
            int count=0;
            for (int j=0; j<n;j++){
                if(arr[j]==arr[i]){
                    count++;
                }
            }
            if(count>maxEl){
                maxEl=count;
                mode=arr[i];
            }
        }
        System.out.println(mode);
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 3};
        findMedian(arr);

        int[] arr2 = {4, 2, 7, 1};
        findMedian(arr2);

        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        findMode(arr3);
    }
}

