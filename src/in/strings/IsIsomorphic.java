package in.strings;



import java.util.HashMap;

public class IsIsomorphic {
    public static boolean isIsomorphic(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        HashMap<Character,Character> hm1=new HashMap<>();
        HashMap<Character, Character> hm2=new HashMap<>();

        for (int i=0; i<str1.length(); i++){
            if(hm1.containsKey(str1.charAt(i))){
                if(hm1.get(str1.charAt(i))!=(str2.charAt(i))){
                    return false;
                }
            }
            hm1.put(str1.charAt(i),str2.charAt(i));
        }
        for (int i=0; i<str2.length(); i++){
            if(hm2.containsKey(str2.charAt(i))){
                if(hm2.get(str2.charAt(i))!=(str1.charAt(i))){
                    return false;
                }
            }
            hm2.put(str2.charAt(i),str1.charAt(i));
        }
        return true;
    }
    public static void main(String[] args) {
        String str="egg";
        String str1="add";
        boolean isomorphic = isIsomorphic(str, str1);
        System.out.println(isomorphic);
    }
}

