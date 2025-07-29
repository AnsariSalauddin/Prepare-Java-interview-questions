package Arrays;


import java.util.Arrays;

public class MergeSortedArray {
    public static int[] mergeSortedArray(int[] num1, int[] num2, int n, int m){
        int i=n-1;
        int j=m-1;
        int k=m+n-1;
        while (j>=0){
            if(i>=0 && num1[i]>num2[j]){
                num1[k]=num1[i];
                k--;
                i--;
            }else {
                num1[k]=num2[j];
                k--;
                j--;
            }
        }
        return num1;
    }
    public static void main(String[] args) {
        int[] num1={1,2,3,0,0,0};
        int[] num2={2,5,6};
        int[] num3 = mergeSortedArray(num1, num2, 3, 3);
        System.out.println(Arrays.toString(num3));

    }
}
