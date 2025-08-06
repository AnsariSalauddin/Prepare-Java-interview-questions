package in.Array;


public class CommonElementThreeArray {
    public static void commonElementInThreeArray(int[] arr1,int[] arr2,int[] arr3) {
        int first = 0;
        int second = 0;
        int third = 0;
        while (first < arr1.length && second < arr2.length && third < arr3.length) {
            if (arr1[first] == arr2[second] && arr2[second] == arr3[third]) {
                System.out.println(arr1[first]);
                first++;
                second++;
                third++;
            } else if (arr1[first] < arr2[second]) {
                first++;
            } else if (arr2[second] < arr3[third]) {
                second++;
            } else {
                third++;
            }
        }
    }
    public static void main(String[] args) {
        int[] input1={1,5,10,20,40,80};
        int[] input2={6,7,20,80,100};
        int[] input3={3,4,15,20,30,70,80,120};
        commonElementInThreeArray(input1,input2,input3);

    }
}

