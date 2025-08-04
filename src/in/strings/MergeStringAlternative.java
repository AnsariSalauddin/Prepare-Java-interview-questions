package in.strings;



public class MergeStringAlternative {
    public static String mergeStringAlternative(String str1, String str2){
        if(str1.isEmpty() || str2.isEmpty()){
            return null;
        }
        StringBuilder res=new StringBuilder();
        int i=0;
        while (i<str1.length() || i<str2.length()){
            if(i<str1.length()){
                res.append(str1.charAt(i));
            }
            if(i<str2.length()){
                res.append(str2.charAt(i));
            }
            i++;
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String str="abc9876";
        String str1="xyz";
        String string = mergeStringAlternative(str, str1);
        System.out.println(string);

    }
}

