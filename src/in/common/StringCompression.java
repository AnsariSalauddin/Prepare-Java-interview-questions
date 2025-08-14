package in.common;



import java.util.*;

public class StringCompression {
    public static  String compressString(String string){
        LinkedHashMap<Character,Integer> ll=new LinkedHashMap<>();
        for (Character ch:string.toCharArray()){
            if(ll.containsKey(ch)){
                ll.put(ch,ll.get(ch)+1);
            }else {
                ll.put(ch,1);
            }
        }
    String res="";
        for (Map.Entry<Character,Integer> m:ll.entrySet()){
            res+=String.valueOf(m.getKey())+m.getValue();
        }
        System.out.println();

        return res;
    }
    public static  String compressString1(String string){
       String res="";
       int i=0;

       while (i<string.length()){
           int count=1;
           char current=string.charAt(i);
          while (i<string.length()-1 && current==string.charAt(i+1)){
              count++;
              i++;
          }
          res+=current+""+count;
          i++;
       }
       return res;
    }
    public static void main(String[] args) {
        String string = compressString1("aaaabbbb");
        System.out.println(string);

    }
}

