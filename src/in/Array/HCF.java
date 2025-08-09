package in.Array;



public class HCF {
    public static void hcf(int a, int b){
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        int i = min;
        while (true){
            if (max%i==0 && min%i==0){
                System.out.println(i);
                break;
            }
            i--;
        }
    }

    public static void main(String[] args) {
        hcf(24,36);
    }
}

