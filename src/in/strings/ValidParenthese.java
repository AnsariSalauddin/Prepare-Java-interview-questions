package in.strings;



import java.util.HashMap;
import java.util.Stack;

public class ValidParenthese {
    public static boolean validParenthese(String str){
        Stack<Character> st=new Stack<>();
        for (Character ch:str.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }else if(ch==')' || ch=='}' || ch==']'){
                if (st.isEmpty() || !isMatching(st.pop(),ch)){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isMatching(Character open ,Character close){
        return (open=='(' && close==')') ||(open=='{' && close=='}') ||(open=='[' && close==']');
    }
    public static void main(String[] args) {
        String str="({[]})";
        boolean b = validParenthese(str);
        System.out.println(b);
    }
}

