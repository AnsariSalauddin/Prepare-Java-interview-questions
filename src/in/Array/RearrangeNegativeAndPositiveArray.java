package in.Array;



import java.util.ArrayList;
import java.util.List;

public class RearrangeNegativeAndPositiveArray {
    public static void reArrangeNegativeAndPositive(int[] arr){
        List<Integer> pos=new ArrayList<>();
        List<Integer> neg=new ArrayList<>();
        for (Integer i:arr){
            if(i>=0){
                pos.add(i);
            }else {
                neg.add(i);
            }
        }
        int i=0; int pos1=0; int neg1=0;
        while (pos1<pos.size() && neg1<neg.size()){
            arr[i++]=neg.get(pos1++);
            arr[i++]=pos.get(neg1++);
        }
        while (pos1<pos.size()){
            arr[i++]=pos.get(pos1++);
        }
        while (neg1<neg.size()){
            arr[i++]=neg.get(neg1++);
        }
        for (Integer s:arr){
            System.out.print(s+" ");
        }
    }
    public static void main(String[] args) {
//        int[] arr={1,2,3,-4,-1,4};
        int[] arr={-5,-2,5,2,4,7,1,8,0,-8};
        reArrangeNegativeAndPositive(arr);

    }
}

