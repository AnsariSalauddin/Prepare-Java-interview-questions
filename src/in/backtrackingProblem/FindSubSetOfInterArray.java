package in.backtrackingProblem;


import java.util.ArrayList;
import java.util.List;

public class FindSubSetOfInterArray {

    public static void printSubSet(int[] arr, String ans,int i){
        if (i==arr.length){
            System.out.println("["+ans+"]");
            return;
        }

        printSubSet(arr, ans+arr[i]+" ",i+1);
        printSubSet(arr,ans,i+1);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3};
        printSubSet(arr,"",0);

    }
}

