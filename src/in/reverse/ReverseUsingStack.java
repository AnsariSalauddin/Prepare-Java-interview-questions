package in.reverse;

import java.util.Stack;

public class ReverseUsingStack {
    public  static String reverseWithStack(String str){
        Stack<Character> st=new Stack<>();
        String trim=str.trim();
        for (int i=0; i<trim.length();i++){
            st.push(trim.charAt(i));
        }

        String res="";
        while (!st.isEmpty()){
            res+=st.pop();
        }
    return res;
    }
    public  static String reverseWithStack1(String str){
        Stack<String> st=new Stack<>();
       String[] split=str.split(" ");

       for (String sg:split){
          st.push(sg);
       }
       while (!st.isEmpty()){
           System.out.print(st.pop()+" ");
       }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(reverseWithStack1("i am salauddin"));
        String string="i,am,salauddin";

    }
}
