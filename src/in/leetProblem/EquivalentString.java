package in.leetProblem;

public class EquivalentString {
    public static boolean equivalentString(String s,String t){
        int len=s.length();
        int[] freq=new int[26];
        for (int i=0; i<len; i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        for (int i=0; i<freq.length;i++){
            if(Math.abs(freq[i])>3){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String word1 = "abcdeef";
        String word2 = "abaaacc";
        boolean b = equivalentString(word1, word2);
        System.out.println(b);


    }
}

