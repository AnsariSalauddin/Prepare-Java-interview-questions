package in.strings;



public class RemoveConsecutiveCharacters {
    public static StringBuilder removeConsecutiveElement(String str){
        StringBuilder res=new StringBuilder();
        res.append(str.charAt(0));
        for (int i=1; i<str.length(); i++){
            if(str.charAt(i-1)!=str.charAt(i)){
                res.append(str.charAt(i));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "aabb";
        StringBuilder stringBuilder = removeConsecutiveElement(s);
        System.out.println(stringBuilder);

    }
}
