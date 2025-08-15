package in.leetCode2;

public class ConsecutiveInString {
    public static int consecutive(String str){
        if(str.isEmpty()){
            return -1;
        }
        int max=0;
       int count=1;
        for (int i=0; i<str.length()-1; i++){
            if(str.charAt(i)==str.charAt(i+1)){
                count++;
               max =Math.max(count,max);
            }else {
                count=1;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String str="abbcccddddeeeeeedcba";
        int consecutive = consecutive(str);
        System.out.println(consecutive);

    }
}
