package in.common;


import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class RemoveDuplicateElement {
    public static  StringBuilder removeDuplicateElement(String s){
        LinkedHashSet<Character> linkedHashSet=new LinkedHashSet<>();
        for (Character ch:s.toCharArray()){
            linkedHashSet.add(ch);
        }
        StringBuilder stringBuilder=new StringBuilder();
        for (Character ch:linkedHashSet){
            stringBuilder.append(ch);
        }
        return  stringBuilder;
    }

    public static void removeDuplicateCharacterFromString(String str){
        if(str.isEmpty()){
            return;
        }
        String ans="";
        for (Character character:str.toCharArray()){
            if(!ans.contains(String.valueOf(character))){
                ans+=String.valueOf(character);
            }
        }

        System.out.println();
        System.out.println(ans);
    }
    public static void main(String[] args) {
//        StringBuilder stringBuilder = removeDuplicateElement("salauddin");
//        System.out.println(stringBuilder);
        removeDuplicateCharacterFromString("salauddin");

    }
}

