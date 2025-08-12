package in.common;


public class CountVowelAndConsonant {
    //first method to count vowel and consonant
    public static  void countVowelsAndConsonant(String str){
        int vol=0;
        int cons=0;
        for (Character ch:str.toLowerCase().toCharArray()){
            if(ch>='a' && ch<='z'){
                if(checkVowel(ch)){
                    vol++;
                }else {
                    cons++;
                }
            }
        }
        System.out.println("Vowels count: "+vol);
        System.out.println("Consonant count: "+cons);
    }
    //second method to count vowel and consonant
    public static  void countVowelsAndConsonant1(String str){
       int vol=0;
       int cons=0;
       String vowels="aeiou";
       for (Character ch:str.toLowerCase().toCharArray()){
           if(ch>='a' && ch<='z'){
               if(vowels.contains(String.valueOf(ch))){
                   vol++;
               }else {
                   cons++;
               }
           }
       }

        System.out.println("vowels: "+vol);
        System.out.println("consonant: "+cons);
    }
    public static  boolean checkVowel(Character ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public static void main(String[] args) {
        countVowelsAndConsonant1("salauddin ansari");

    }
}

