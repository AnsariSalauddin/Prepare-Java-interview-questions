package in.common;


import java.util.HashMap;
import java.util.Map;

public class CheckAnagram {
    public static int checkAnagram(String string1, String string2) {
        char[] charArray = string1.toCharArray();
        char[] charArray1 = string2.toCharArray();
        Map<Character, Integer> hm = new HashMap<>();
        for (Character c : charArray) {
            if (hm.containsKey(c)) {
                hm.put(c, hm.get(c) + 1);
            } else {
                hm.put(c, 1);
            }
        }

        for (Character ch : charArray1) {
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) - 1);
            }
        }
        int i = 0;
        for (Integer i1 : hm.values()) {
            if (i1 > 1) {
                i = i1;
                break;
            }
        }

        return i;

    }

    public static void main(String[] args) {
        String string1 = "listen";
        String string2 = "slient";
        int i = checkAnagram(string1, string2);
        if (i > 1) System.out.println("String is not anagram ");
        else System.out.println("string anagram");

    }
}

