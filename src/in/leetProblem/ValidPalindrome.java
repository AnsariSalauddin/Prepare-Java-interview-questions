package in.leetProblem;

public class ValidPalindrome {
    public static boolean checkPalindrome(String str){
        String s = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start=0;
        int end=s.length()-1;
        while (start<end){
            if(s.charAt(start)!=s.charAt(end)){
               return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String string="A man, a plan, a canal: Panama";
        boolean b = checkPalindrome(string);
        System.out.println(b);

    }
}
