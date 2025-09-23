package in.reverse;

public class CheckBalanceString {
    public static boolean checkBalanceString(String str){
        int evenSum=0;
        int oddSum=0;
        for (int i=0; i<str.length();i++){
            if(i%2==0){
                evenSum+=str.charAt(i)-'0';
            }else {
                oddSum+=str.charAt(i)-'0';
            }

        }
        return evenSum==oddSum;
    }
    public static void main(String[] args) {
        String num= "24123";
        boolean b = checkBalanceString(num);
        System.out.println(b);
    }
}
