package in.reverse;


public class addBinary {
    public static String addBinary(String str, String str1){
        int i=str.length()-1;
        int j=str1.length()-1;
        int carry=0;
        StringBuilder res=new StringBuilder();

        while (i>=0 || j>=0|| carry==1){
            int sum=carry;
            if(i>=0){
                sum+=str.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                sum+=str1.charAt(j)-'0';
                j--;
            }
            res.append(sum%2);
            carry=sum/2;
        }
        return res.reverse().toString();
    }
    public static void main(String[] args) {
            String str="11";
            String str2="1";
        String string = addBinary(str, str2);
        System.out.println(string);
    }
}

