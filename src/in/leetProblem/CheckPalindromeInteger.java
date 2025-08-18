package in.leetProblem;


public class CheckPalindromeInteger {
    public static boolean checkPalindrome(int x){
        int rev=0;
        int temp=x;
        while (temp>0){
            int p=temp%10;
            rev=rev*10+p;
            temp=temp/10;
        }

        return x == rev;
    }
    public static void main(String[] args) {
        int x=121;
        boolean b = checkPalindrome(x);
        System.out.println(b);
        if(b){
            System.out.println("Given number is palindrome");
        }else {
            System.out.println("Not Palindrome");
        }

    }
}

