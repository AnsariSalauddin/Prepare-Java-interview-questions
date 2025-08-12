package in.backtrackingProblem;


public class FindSubSetOfString {
    public static void findSubsetOfString(String str, String ans, int i){
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        //yes
        findSubsetOfString(str,ans+str.charAt(i),i+1);
        //no
        findSubsetOfString(str,ans,i+1);
    }
    public static void main(String[] args) {
        String str="abc";
        findSubsetOfString(str,"",0);
    }
}

