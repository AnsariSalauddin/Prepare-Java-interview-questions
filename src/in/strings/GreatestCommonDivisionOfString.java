package in.strings;



public class GreatestCommonDivisionOfString {
    public static String greatestCommonDivisionOfString(String str1,String str2){
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
      int gcdLength=gcd(str1.length(),str2.length());
        return str1.substring(0,gcdLength);
    }
    public static int gcd(int l1, int l2){
        while (l2!=0){
            int temp=l1%l2;
            l1=l2;
            l2=temp;
        }

        return l1;
    }

    public static void main(String[] args) {
        String  str1 = "ABCABC";
        String str2 = "ABC";
        String string = greatestCommonDivisionOfString(str1, str2);
        System.out.println(string);

    }
}

