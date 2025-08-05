package in.strings;



public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicate(int[] num){
        int count=0;
        for (int i=0; i<num.length; i++){
            if(i<num.length-1 && num[i]==num[i+1]){
                continue;
            }else {
                num[count]=num[i];
                count++;
            }
        }
        while (count<num.length){
            num[count]=0;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] num={0,0,1,1,1,2,2,3,3,4};
        int i = removeDuplicate(num);
        System.out.println(i);
        for (int i1:num){
            System.out.print(i1+" ");
        }

    }
}

