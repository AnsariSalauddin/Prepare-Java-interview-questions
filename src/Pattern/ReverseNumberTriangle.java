package in.Pattern;

public class ReverseNumberTriangle {
    public static void reverseNumberTriangle(int n){
        for (int i=1; i<=n;i++){
            for (int k1=1 ;k1<i;k1++){
                System.out.print(" ");
            }
            for (int k=i;k<=n;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=4;
        reverseNumberTriangle(n);
    }
}
