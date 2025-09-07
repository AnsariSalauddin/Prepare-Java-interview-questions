package in.Pattern;

public class RightPascalTriangle {
    public static void rigthPascal(int n){
        for (int i=1; i<=n;i++){
            for (int j=1; j<=i;j++){
                if((i+j)%2==0  ){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        for (int i=2; i<=n;i++){
            for (int j=1; j<=n-i+1; j++){
                if((i+j)%2!=0  ){
                    System.out.print("   ");
                }else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
            int n=3;
            rigthPascal(n);
    }
}
