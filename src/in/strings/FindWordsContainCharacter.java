package in.strings;



import java.util.ArrayList;
import java.util.List;

public class FindWordsContainCharacter {
    public static List<Integer> findWordContainCharacter(String[] arr, String x){
        List<Integer> res=new ArrayList<>();
        for (int i=0;i<arr.length; i++){
            if(arr[i].contains(x)){
                res.add(i);
            }
        }
        return res;
    }
    public static void main(String[] args) {
            String[] words = {"abc","bcd","aaaa","cbc"};
            String x="a";
        List<Integer> wordContainCharacter = findWordContainCharacter(words, x);
        System.out.println(wordContainCharacter);
    }
}

