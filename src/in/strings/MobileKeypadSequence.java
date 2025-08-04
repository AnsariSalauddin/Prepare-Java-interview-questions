package in.strings;


public class MobileKeypadSequence {
    public static String convertToKeypadSequence(String str,String[] keyboad){
        String res="";
        for (int i=0; i<str.toLowerCase().length();i++){
            if(str.charAt(i)==' '){
                res+="0";
            }else if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                res+=keyboad[str.charAt(i)-'a'];
            }
        }
        return res;

    }
    public static void main(String[] args) {
        String[] keyboad={
                "2","22","222",// a,b,c
                "3","33","333",//d, e,f
                "4","44","444",//g,h,i
                "5","55","555",//j, k,l
                "6","66","666",//m,n,o
                "7","77","777","777",//p,q ,r s
                "8","88","888",//t,u,v
                "9","999","999","9999",//w, x,y,z
        };
        String sentence = "hello world";
        String s = convertToKeypadSequence(sentence, keyboad);
        System.out.println(s);

    }
}

