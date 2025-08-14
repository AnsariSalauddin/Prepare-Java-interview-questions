package in.common;


public class StringPermutation {
     public  static  void generatePermutation(String string,String s){
         if (string.isEmpty()){
             System.out.println(s);
             return;
         }
         for (int i=0; i<string.length(); i++){
             char current=string.charAt(i);
             String remain=string.substring(0,i)+string.substring(i+1);
             generatePermutation(remain,s+current);
         }
     }
    public static void main(String[] args) {
        generatePermutation("abcd","");
    }
}
