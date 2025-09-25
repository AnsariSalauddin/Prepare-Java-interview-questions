package in.sort;

import java.util.Arrays;
//--------------Longest Common Prefix using Sorting----------------
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] str={"geeksforgeeks","geeks","geek","geezer"};
        Arrays.sort(str);
        System.out.println(str[3]);
        String first=str[0];
        String last=str[str.length-1];
        int minLenth=Math.min(first.length(),last.length());
        int i=0;
        while (i<minLenth && first.charAt(i)==last.charAt(i)){
            i++;
        }
        String res=first.substring(0,i);
        System.out.println(res);
    }
}

