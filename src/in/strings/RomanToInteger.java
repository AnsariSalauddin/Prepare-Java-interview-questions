package in.strings;


import java.util.HashMap;

public class RomanToInteger {
    public static int romanToInteger(String str){
        if(str.isEmpty()){
            return -1;
        }
        HashMap<Character, Integer> hashMap=new HashMap<>();
        hashMap.put('I',1);
        hashMap.put('V',5);
        hashMap.put('X',10);
        hashMap.put('L',50);
        hashMap.put('C',100);
        hashMap.put('D',500);
        hashMap.put('M',1000);
        int result=hashMap.get(str.charAt(str.length()-1));
        for (int i=str.length()-2; i>=0; i--){
            if(hashMap.get(str.charAt(i))<hashMap.get(str.charAt(i+1))){
                result=result-hashMap.get(str.charAt(i));
            }else {
                result+=hashMap.get(str.charAt(i));
            }
        }
        return result;
    }
    public static void main(String[] args) {
//        String s = "III";
//        String s="LVIII";
        String  s = "MCMXCIV";
        int i = romanToInteger(s);
        System.out.println(i);
    }
}

