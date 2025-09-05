package in.leetProblem;

public class ReverseInteger1 {
    public static void reverseInteger(int number){

        int result=0;
        while (number!=0){

            int q=number%10;
//            if(result>Integer.MAX_VALUE/10 || result< Integer.MIN_VALUE/10){
//                return ;
//            }
            result=(result*10)+q;
            number = number / 10;
        }
        System.out.println(result);

    }
    public static void main(String[] args) {
        int number=100990898;
        reverseInteger(number);

        
    }
}
