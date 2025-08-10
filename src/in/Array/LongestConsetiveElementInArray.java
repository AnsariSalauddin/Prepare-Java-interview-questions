package in.Array;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LongestConsetiveElementInArray {
    public static void consecutive(int[] arr){
        HashSet<Integer> hashSet=new HashSet<>();
        ArrayList<Integer> longestSeq=new ArrayList<>();

        for(Integer s:arr){
            hashSet.add(s);
        }
        int maxLength=0;
        for(Integer n:arr){
            if(!hashSet.contains(n-1)){
                ArrayList<Integer> currentSeq=new ArrayList<>();
                int currentNum=n;
                int currentLength=0;
                while (hashSet.contains(currentNum)){
                    currentSeq.add(currentNum);
                    currentNum++;
                    currentLength++;
                }
                if(currentLength>maxLength){
                    maxLength=currentLength;
                    longestSeq=currentSeq;
                }
            }
        }
        longestSeq.forEach(System.out::println);
    }
    public static void main(String[] args) {
//        int[] arr = {100, 4, 200, 1, 5,3, 2};
        int[] arr={2,3,4,7,1,8,9};
        consecutive(arr);
    }
}

