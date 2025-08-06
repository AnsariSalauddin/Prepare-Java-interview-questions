package in.strings;


import java.util.ArrayList;
import java.util.List;

public class SubSet {
    public static void printSubSet(int[] arr,String res, int i) {

    if(i==arr.length){
        System.out.println(res);
        return;
    }
    printSubSet(arr,res+arr[i]+" ",i+1);
    printSubSet(arr,res,i+1);

    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        printSubSet(array,"",0);

    }
}
