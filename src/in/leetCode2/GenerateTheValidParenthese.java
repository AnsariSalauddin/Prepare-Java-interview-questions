package in.leetCode2;



import java.util.ArrayList;
import java.util.List;

public class GenerateTheValidParenthese {
    public static List<String> generateValidParenthese(List<String> list,String cur,int open, int close, int max){
        if(cur.length()==2*max){
            list.add(cur);
            return list;
        }
        if(open<max){
            generateValidParenthese(list,cur+"(",open+1,close,max);
        }
        if(close<open){
            generateValidParenthese(list,cur+")",open,close+1,max);
        }
        return list;
    }
    public static void main(String[] args) {
        List<String> list = generateValidParenthese(new ArrayList<>(), "", 0, 0, 3);
        System.out.println(list);
    }
}
