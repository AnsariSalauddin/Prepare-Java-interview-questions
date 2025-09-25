package in.sort;

public class ShuffleString {
    public static void main(String[] args) {
        String str="codeleet";
        int l=str.length();
        int[] slice={4,5,6,7,0,2,1,3};
        char[] char1=new char[l];
        for(int i=0; i<l; i++){
            char1[slice[i]]=str.charAt(i);
        }
        String res=new String(char1);
        System.out.println(res);
    }
}

