package in.strings;



public class IntegerToRoman {
    public static StringBuilder integerToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                res.append(symbols[i]);
                num -= values[i];
            }
        }
        return res;

    }

    public static void main(String[] args) {
        int num = 1994;
        StringBuilder stringBuilder = integerToRoman(num);
        System.out.println(stringBuilder);

    }
}

