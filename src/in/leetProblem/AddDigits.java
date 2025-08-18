package in.leetProblem;


public class AddDigits {
    public static int addDigits(int num){
        if(num==0){
            return 0;
        }
        return (num%9==0)?9:num%9;
    }
    public static void main(String[] args) {
        int num=23;
        int i = addDigits(num);
        System.out.println(i);

    }
}
