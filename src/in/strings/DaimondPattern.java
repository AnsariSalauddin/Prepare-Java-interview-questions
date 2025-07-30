package in.strings;



public class DaimondPattern {
    public static void printDiamondPatter(int n) {
        for (int i = 1; i <=n; i++) {
           if(i%2!=0){
               for (int j = 0; j < n - i-1 ; j++) {
                   System.out.print("_");
               }
               for (int k = 0; k < i ; k++) {
                   System.out.print("* ");
               }

               System.out.println();
           }
        }
        for (int i = 2; i < n; i++) {
            if(i%2!=0){
                for (int j = 0; j < i-1; j++) {
                    System.out.print("_");
                }
                for (int g = 0; g < n - i; g++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        printDiamondPatter(3);
    }
}

