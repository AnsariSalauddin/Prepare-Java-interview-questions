package in.Pattern;

public class K_Pattern {
    public static void k_Pattern(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=2; i<=n; i++){
            for (int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
        k_Pattern(n);
    }
}
