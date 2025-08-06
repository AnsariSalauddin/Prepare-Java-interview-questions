package in.strings;

//package in.apnaCollageDsaProgramme.Strings;
//
//import java.util.Arrays;
//
//public class StringCompress {
//    public static int compressString(char[] chars){
//        String res="";
//        for (int i=0; i<chars.length; i++){
//            int count=0;
//            String current=String.valueOf(chars[i]);
//            while (i<chars.length && current.equals(String.valueOf(chars[i]))){
//                count++;
//                i++;
//            }
//            res+=current+""+count;
//
//        }
//        System.out.println(res);
//        return res.length();
//    }
//    public static void main(String[] args) {
//        char[] chars={'a','a','b','b','c','c','c'};
//        //char[] chars={'a'};
//        int i = compressString(chars);
//        System.out.println(i);
//    }
//}


public class StringCompress {
    public static int compressString(char[] chars) {
        StringBuilder res = new StringBuilder();
        int i = 0;

        while (i < chars.length) {
            char current = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == current) {
                count++;
                i++;
            }

            res.append(current);
            if (count > 1) {
                res.append(count);
            }
        }

        System.out.println(res.toString());
        return res.length();
    }

    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int length = compressString(chars);
        System.out.println("Compressed Length: " + length);
    }
}


