package in.leetCode2;


public class ReverseOnlyLetter {
    public static String reverseOnlyLetter(String str){
        if(str.isEmpty()){
            return "";
        }
        char[] charArray = str.toCharArray();
        int start=0;
        int end=charArray.length-1;
        while (start<end){
            if(checkAlphbet(charArray[start]) && checkAlphbet(charArray[end])){
                char cur=charArray[start];
                charArray[start]=charArray[end];
                charArray[end]=cur;
                start++;
                end--;
            }else if(!checkAlphbet(charArray[start])) {
                start++;
            }else if(!checkAlphbet(charArray[end])) {
                end--;
            }

        }
        return String.valueOf(charArray);
    }
    public static boolean checkAlphbet(Character ch){
        if(ch>='a' && ch<='z'|| ch>='A' && ch<='Z'){
            return true;
        }
        return false;
    }

    public static String reverseCharacter(String str){
        if(str.isEmpty()){
            return "";
        }
        char[] charArray = str.toCharArray();
        int start=0;
        int end=charArray.length-1;
        while (start<end){
            if(!Character.isLetter(charArray[start])){
                start++;
            }else if(!Character.isLetter(charArray[end])){
                end--;
            }else {
                char cur=charArray[start];
                charArray[start]=charArray[end];
                charArray[end]=cur;
                start++;
                end--;
            }
        }
        return String.valueOf(charArray);

    }
    public static void main(String[] args) {
            String str="a-bC-dEf-ghIj";
//        String s = reverseOnlyLetter(str);
//        System.out.println(s);
        String s = reverseCharacter(str);
        System.out.println(s);
    }
}

