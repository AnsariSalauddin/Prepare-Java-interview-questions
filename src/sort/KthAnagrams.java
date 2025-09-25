package in.sort;

import java.util.HashMap;

public class KthAnagrams {
    public  static boolean k_checkAnagrams(String string1, String string2, int k){
        if(string2.length()!=string1.length()){
            return false;
        }
        HashMap<Character, Integer> keysValue=new HashMap<>();
        for(char ch:string1.toCharArray()){
            keysValue.put(ch,keysValue.getOrDefault(ch,0)+1);
        }
        for (char ch:string2.toCharArray()){
            if(keysValue.containsKey(ch) && keysValue.get(ch)>0){
                keysValue.put(ch,keysValue.get(ch)-1);
            }
        }
        int count=0;
        for (int i:keysValue.values()){
            count+=i;
        }
        return count<=k;
    }
    public static void main(String[] args) {
        String string1="apple";
        String string2="appza";
        int kth=2;
        if(k_checkAnagrams(string1,string2,kth)){
            System.out.println("yes Kth-anagrams");
        }else {
            System.out.println("No-Kth anagrams");
        }
    }
}
