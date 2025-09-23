package in.reverse;

public class Ransom {
    public static boolean ranSom(String ranSomeNote, String magzine){
        int[]  count=new int[26];
        for (char c:magzine.toCharArray()){
            count[c-'a']++;
        }
        for (char c:ranSomeNote.toCharArray()){
            if(count[c-'a']==0){
                return false;
            }
            count[c-'a']--;
        }
        return true;
    }
    public static void main(String[] args) {
            String ransome="ab";
            String magzine="aab";
        boolean b = ranSom(ransome, magzine);
        System.out.println(b);
    }
}
