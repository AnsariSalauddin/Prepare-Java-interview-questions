package in.leetProblem;


public class FindtheDifference {
    public static char findtheDifference(String s, String t){
        int total=0;
        for (int i=0; i<t.length(); i++){
            total=total+t.charAt(i);
        }
        for (int i=0; i<s.length(); i++){
            total=total-s.charAt(i);
        }
        return  (char)Math.abs( total);
    }
    public static void main(String[] args) {
        char c = findtheDifference("abcdea", "abcde");
        System.out.println(c);

    }
}
