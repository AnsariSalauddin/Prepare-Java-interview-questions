package in.leetProblem;



import java.util.*;

public class ConcatenateStringProblem {
    public static List<String> concatenateString(String[] word){
        HashMap<String,Boolean> hm=new HashMap<>();
        HashSet<String> hs=new HashSet<>();
        for (int i=0; i<word.length;i++){
            hs.add(word[i]);
        }
        List<String> li=new ArrayList<>();
        for (int i=0; i<word.length;i++){
            if (isConcatenate(word[i],hs,hm)){
                li.add(word[i]);
            }
        }
    return li;
    }
    public static boolean isConcatenate(String word, Set<String> st, Map<String,Boolean> mp){
//        if(mp.containsKey(word)){
//            return mp.get(word);
//        }
        for (int i=0; i<word.length(); i++){
            String prefix=word.substring(0,i+1);
            String suffix=word.substring(i+1,word.length());
            if(st.contains(prefix)&& st.contains(suffix )|| st.contains(prefix) && isConcatenate(suffix,st,mp)){
                mp.put(word,true);
                return true;
            }
        }
        mp.put(word,false);
        return false;
    }
    public static void main(String[] args) {
//        String[] arr={"do","g","cat","dogcat"};
        String[] arr={"d","og","cat","dog1","ca"};
        List<String> list = concatenateString(arr);
        list.forEach(System.out::println);

    }
}
