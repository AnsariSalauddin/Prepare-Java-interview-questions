package in.leetProblem;

public class LengthOfLastWordInString {
    public static int lastWordLengthInString(String string){
        String trim = string.trim();
        int count=0;
        for (int i=trim.length()-1; i>=0;i--){
            if(trim.charAt(i)!=' '){
                count++;
            }else {
                break;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String string="  i am salauddin     ";
        System.out.println(lastWordLengthInString(string));

    }
}
