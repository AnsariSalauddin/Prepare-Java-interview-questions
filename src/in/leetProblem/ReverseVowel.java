package in.leetProblem;

public class ReverseVowel {
    public static String reverseVowel(String str){

        char[] chars=str.toCharArray();
        int start=0;
        int end=chars.length-1;
       while (start<end){
           if(!checkVowel(chars[start])){
               start++;
           }else if(!checkVowel(chars[end])){
               end--;
           }else {
               char temp=chars[start];
               chars[start]=chars[end];
               chars[end]=temp;
               start++;
               end--;
           }
       }
    return String.valueOf(chars);

    }
    public static boolean checkVowel(char ch){
        if(ch=='a' ||ch=='e' || ch=='o' || ch=='i' || ch=='u' || ch=='A' ||ch=='E' || ch=='I' || ch=='O'|| ch=='U'){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str="IceCreAm";
        String str1 = reverseVowel(str);
        System.out.println(str1);


    }
}
