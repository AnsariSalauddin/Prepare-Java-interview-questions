package in.leetProblem;

import java.util.ArrayList;
import java.util.List;

public class LongestNonRepeatingSubstring {
    public static void nonRepeatingSubstring(String ss){
        int longest=0;
        int start=0;
        int end=0;
        List<Character> list=new ArrayList<>();
        //List<String> lls=new ArrayList<>();

      while (end<ss.length()){
          if(!list.contains(ss.charAt(end))){
              list.add(ss.charAt(end));
              longest=Math.max(longest, list.size());
              end++;
          }else {

              list.remove(Character.valueOf(ss.charAt(start)));
              start++;
          }
      }

        System.out.println(longest);

    }
    public static void main(String[] args) {
       String string="abcefabcbb";
       nonRepeatingSubstring(string);


    }
}
