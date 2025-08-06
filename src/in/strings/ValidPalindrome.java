package in.strings;



public class ValidPalindrome {
    public static boolean validPalindrome(String s){
        String lowerCase = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int start=0;
        int end=lowerCase.length()-1;
        while (start<=end){
            if(lowerCase.charAt(start)!=lowerCase.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
//        String str="A man, a plan, a canal: Panama";
        String str="0P";
        boolean b = validPalindrome(str);
        System.out.println(b);
    }
}

