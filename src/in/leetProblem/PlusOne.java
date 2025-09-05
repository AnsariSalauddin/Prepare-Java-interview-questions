package in.leetProblem;

public class PlusOne {
    public static int[] plusOne(int[] digits){
        int length = digits.length;
        for (int i=length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] newArray=new int[length+1];
        newArray[0]=1;
        return newArray;
    }
    public static void main(String[] args) {
        int[]arr={9,9};
        int[] ints = plusOne(arr);
        for (int i:ints){
            System.out.println(i);
        }

    }
}

