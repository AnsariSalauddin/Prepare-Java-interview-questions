package in.leetProblem;

public class FirstNonRepeatingElment {
    public static int firstNonRepeatingElementInString(String str){
        int[] fre=new int[26];
        char[] ch=str.toCharArray();
        for (char ch1:ch){
            fre[ch1-'a']++;
        }
        for (int i=0; i<ch.length;i++){
            if(fre[ch[i]-'a']==1){
                return i;
            }
        }
        return -1;
    }
    public static int firstRepeatingElementInString(String str){
        int[] freq=new int[26];
        char[] chars=str.toCharArray();
        for (char ch:chars){
            freq[ch-'a']++;
        }
        for (int i=0;i<chars.length; i++){
            if(freq[chars[i]-'a']>1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s="loveleetcode";
        int c = firstNonRepeatingElementInString(s);
        System.out.println(c);
        int i = firstRepeatingElementInString(s);
        System.out.println(i);
    }
}
