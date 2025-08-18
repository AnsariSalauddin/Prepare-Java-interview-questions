

public class UglyNumber {
    public static boolean uglyNumber(int number) {
        if(number<=0){
            return false;
        }
        if(number==1){
            return true;
        }

        while (true) {
            if (number % 2 == 0) {
                number = number / 2;
            } else if (number % 3 == 0) {
                number = number / 3;
            } else if (number % 5 == 0) {
                number = number / 5;
            } else {
                break;
            }
            if (number == 1) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int num = 6;
        boolean b = uglyNumber(num);
        System.out.println(b);
    }
}

