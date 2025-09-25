package in.sort;

public class EncryptString {
    public static String encrypt(String string){
        String res="";
        int i=0;
        while(i<string.length()){
            char currentChar=string.charAt(i);
            int count=0;
            while (i<string.length() && string.charAt(i)==currentChar){
                count++;
                i++;
            }
            res+=currentChar+""+count;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(encrypt("aaaaabbb"));
        System.out.println(encrypt("abbbdggkmnoo"));
    }
}
