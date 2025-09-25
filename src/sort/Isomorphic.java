package in.sort;

import java.util.HashMap;

public class Isomorphic {

    public static boolean isomorphicString(String string, String string1) {
        if (string.length() != string1.length()) {
            return false;
        }

        HashMap<Character, Character> hm = new HashMap<>();
        HashMap<Character, Character> hm1 = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            char ch1 = string.charAt(i);
            char ch2 = string1.charAt(i);

            if (hm.containsKey(ch1)) {
                if (hm.get(ch1) != ch2) {
                    return false;
                }

            } else {
                hm.put(ch1, ch2);
            }

            if (hm1.containsKey(ch2)) {
                if (hm1.get(ch2) != ch1) {
                    return false;
                }
            } else {
                hm1.put(ch2, ch1);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String string = "abc";
        String string1 = "ddf";
        if (isomorphicString(string, string1)) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }
    }
}
