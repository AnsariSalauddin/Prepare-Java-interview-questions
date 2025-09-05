package in.leetProblem;


public class  PowerOfTwo {
    public static boolean powerOfTwo(int num){
        int num1=num;
        while (num1!=1){
            if(num1%2!=0){
               return false;
            }else {
                num1=num1/2;
            }
        }
        return true;
    }
    public static void main(String[] args) {
            int num=129;
        System.out.println(powerOfTwo(num));
    }
}

