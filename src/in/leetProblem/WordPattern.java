package in.leetProblem;

import java.util.HashMap;

public class WordPattern {
    public static boolean wordPattern(String pattern, String[] str){
        if(pattern.length()!=str.length){
            return false;
        }
        HashMap<Character,String> hashMap=new HashMap<>();
        HashMap<String,Character> hashMap1=new HashMap<>();
        for (int i=0; i<pattern.length();i++){
            if(hashMap.containsKey(pattern.charAt(i))){
                if(!hashMap.get(pattern.charAt(i)).equals(str[i])){
                    return false;
                }
            }
            hashMap.put(pattern.charAt(i),str[i]);
        }
        for (int i=0; i<str.length;i++){
            if(hashMap1.containsKey(str[i])){
                if(!hashMap1.get(str[i]).equals(pattern.charAt(i))){
                    return false;
                }
            }
            hashMap1.put(str[i],pattern.charAt(i));
        }
        return true;
    }
    public static void main(String[] args) {
        String pattern="abba";
        String[] str={"dog","cat","cat","dog"};
        boolean b = wordPattern(pattern, str);
        System.out.println(b);

    }
}
