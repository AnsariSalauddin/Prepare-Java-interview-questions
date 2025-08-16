package in.leetCode2;

public class StringToInteger {
    public static int stringToInteger(String str){
       str=str.trim();
       int len=str.length();
       int i=0;
       if(str.isEmpty()){
           return 0;
       }
       int sign=1;
       if(str.charAt(i)=='-' || str.charAt(i)=='+'){
           sign=(str.charAt(i)=='-')?-1:1;
           i++;
       }
       long num=0;
       while (i<len && Character.isDigit(str.charAt(i))){
           num=num*10+(str.charAt(i)-'0');
           if(num*sign>Integer.MAX_VALUE){
               return Integer.MAX_VALUE;
           }
           if (num*sign<Integer.MIN_VALUE){
               return Integer.MIN_VALUE;
           }
           i++;
       }
        return (int) num*sign;
    }
    public static void main(String[] args) {
        String str="-042";
        System.out.println(stringToInteger(str));
    }
}
