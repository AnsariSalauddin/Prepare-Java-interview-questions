package in.leetProblem;

public class ReverseString {
    public static StringBuilder reverseString(String str){
        String trim = str.trim();
        String[] s = str.split(" +");
        StringBuilder res=new StringBuilder();
        for (int i=s.length-1; i>=0;i--){
           res.append(s[i]);
           res.append(" ");
        }
        System.out.println(res);
        return  res;
    }
    public static void main(String[] args) {
        String str="i am salauddin";
        StringBuilder stringBuilder = reverseString(str);
        System.out.println(stringBuilder);

    }
}
