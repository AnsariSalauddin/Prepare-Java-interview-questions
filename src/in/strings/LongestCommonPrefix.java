package in.strings;



import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] str){
        Arrays.sort(str);
        String start=str[0];
        String end=str[str.length-1];
        int index=0;
        while (index<=start.length()-1){
            if(start.charAt(index)==end.charAt(index)){
                index++;
            }else {
                break;
            }
        }
     return start.substring(0,index);
    }
    public static void main(String[] args) {
   String[] str={"flower","flow","flight"};
        String s = longestCommonPrefix(str);
        System.out.println(s);
    }
}
