package in.Array;



public class LCM {
    public static void lcm(int a, int b){
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        int i = max;
        while (true){
            if (i%min==0){
                System.out.println(i);
                break;
            }
            i+=max;
        }
    }

    public static void main(String[] args) {
        lcm(24,36);

    }
}

