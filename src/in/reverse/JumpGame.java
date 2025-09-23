package in.reverse;

public class JumpGame {
    public static boolean jumpGame(int[] jump){
        int lastIn=jump.length-1;
        for (int i=jump.length-2;i>=0;i--){
            if(jump[i]+i>= lastIn){
               lastIn=i;
            }
        }
        return lastIn==0;
    }
    public static void main(String[] args) {
        int[] jump={0,1,1,2,4};
        boolean b = jumpGame(jump);
        System.out.println(b);
    }
}
