package in.leetProblem;



public class CheckAnagram {
    public static boolean checkAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if (n != m) {
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < n; i++) {
            count[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < m; i++) {
            count[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                return false;
            }

        }
        return true;

    }


    public static void main(String[] args) {
        String str="anagram";
        String str1="gamarag";
        boolean b = checkAnagram(str, str1);
        System.out.println(b);

    }
}
