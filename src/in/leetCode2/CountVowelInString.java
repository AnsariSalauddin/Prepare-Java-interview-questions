package in.leetCode2;



public class CountVowelInString {
    public static int countVowelNumber(String[] arr, int left, int right){
        int count=0;
        for (int i=left; i<=right; i++){
            int s = arr[i].charAt(0);
            int e=arr[i].charAt(arr[i].length()-1);
            if(s=='a' || s=='e' || s=='i' || s=='o' || s=='u'){
                if (e=='a' || e=='e' || e=='i' || e=='o' || e=='u'){
                    count++;
                }
            }
        }
        return count;
    }
    public static int countVowelNumber1(String[] arr, int left, int right){
        int count=0;
        String vowel="aeiou";
        for (int i=left; i<=right; i++){
            Character s = arr[i].charAt(0);
            Character e=arr[i].charAt(arr[i].length()-1);
            if(vowel.contains(String.valueOf(s)) && vowel.contains(String.valueOf(e))){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
//        String[] str={"are","amy","u"};
//           String[] str={"hey","aeo","mu","ooo","artro"};
//        int i = countVowelNumber(str, 1, 4);
//        System.out.println(i);

        String[] str={"hey","aeo","amu","ooo","artro"};
        int i = countVowelNumber1(str, 1, 4);
        System.out.println(i);


    }
}

