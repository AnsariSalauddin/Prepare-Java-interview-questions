package in.Pattern;

public class MirrorImageTrianglePattern {
    public static void mirrorImageTrianglePattern(int n){
        for (int i=1; i<=n;i++){
            for (int j=1; j<i;j++){
                System.out.print(" ");
            }
            for (int j=i;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for (int i=n-1; i>=1;i--){
            for (int j=1; j<i;j++){
                System.out.print(" ");
            }
            for (int j=i;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
            int n=9;
            mirrorImageTrianglePattern(n);
    }
}
