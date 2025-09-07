package in.Pattern;

public class RhombusPattern {
    public static void rhombusPatter(int n){
        for (int i=1; i<=n; i++){
            for (int j=1;j<i;j++){
                System.out.print("  ");
            }
            for (int j=1; j<=n;j++){
                System.out.print("* ");
            }
            for (int j=1;j<2*(n-i)+1;j++){
                System.out.print("__");
            }
            for (int j=1; j<=n;j++){
                System.out.print("* ");
            }

            System.out.println();
        }

    }
    public static void main(String[] args) {
        int n=5;
        rhombusPatter(n);
    }
}
