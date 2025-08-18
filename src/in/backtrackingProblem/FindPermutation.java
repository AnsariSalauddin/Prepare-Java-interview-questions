package in.backtrackingProblem;



public class  FindPermutation {
    public static void findPermutation(String str,String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        for (int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            //System.out.print(c+" ");
            String remain=str.substring(0,i)+str.substring(i+1);
            findPermutation(remain,ans+c);
        }

    }
    public static void main(String[] args) {
        String str="abc";
        findPermutation(str,"");
    }
}

