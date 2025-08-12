package in.common;


import java.util.HashMap;
import java.util.Map;

public class CharacterFrequencyCount {
    public static void characterFrequencyCount(String string){
        HashMap<Character ,Integer> hashMap=new HashMap<>();
        for (Character ch:string.toCharArray()){
            if(hashMap.containsKey(ch)){
                hashMap.put(ch, hashMap.get(ch)+1);
            }else {
                hashMap.put(ch,1);
            }
        }
        for (Map.Entry<Character,Integer> me:hashMap.entrySet()){
            System.out.println(me.getKey()+":"+me.getValue());
        }
    }
    public static void main(String[] args) {
        characterFrequencyCount("salauddin");
    }
}

