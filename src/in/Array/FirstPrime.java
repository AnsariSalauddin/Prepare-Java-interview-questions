package in.Array;


public class FirstPrime {
    public static boolean primeNumber(int n) {
//        if (n <= 1) {
//            return false;
//        }
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int count = 0;
        int i = 2;


        while (true) {
            if (primeNumber(i)) {
                System.out.print(i + " ");
                count++;
            }

            i++;
            if (count == 50) {
                break;
            }
        }

    }
}

