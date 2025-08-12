package in.common;

//Longest Substring Without Repeating Characters:
// Find the longest substring without repeating characters in a given string.


import java.util.HashSet;

public class LongestSWithoutRElement {
    public static String logestSubstringWithoutRepeatingElement(String string){
        int max=0;
        int n=string.length();
        int start=0;
        int left=0;
        HashSet<Character> hs=new HashSet<>();
        for (int rigth=0; rigth<n; rigth++){
            char current=string.charAt(rigth);
            if(hs.contains(current)){
                hs.remove(string.charAt(left));
                left++;
            }
            hs.add(current);
            if(rigth-left+1>max){
                max=rigth-left+1;
                start=left;
            }
        }
        return string.substring(start,start+max);
    }

    public static void main(String[] args) {
        String string="abcabdb";
        String string1 = logestSubstringWithoutRepeatingElement(string);
        System.out.println(string1);


    }
}

