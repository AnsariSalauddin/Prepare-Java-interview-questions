package in.strings;



import java.util.ArrayList;

public class FindElemetLeftSmallerAndRightGreater {
    public static void print(int[] arr){
        ArrayList<Integer> al=new ArrayList<>();
        for (int i=0; i<arr.length; i++){
            if(i==0){
                if(arr[i]<=arr[i+1]){
                    al.add(arr[i]);
                }
            }else if(i==arr.length-1){
                if(arr[i]>=arr[i-1]){
                    al.add(arr[i]);
                }
            }else {
                if(arr[i]>arr[i-1] &&arr[i]<arr[i+1]){
                    al.add(arr[i]);
                }
            }

        }
        System.out.println(al);
    }
    public static void main(String[] args) {
//        int[] array={4,7,11,6,8,12,9};
//        int[] array={1,3,6,4,5};
        int[] array={5,6,4,20};
        print(array);
    }
}

