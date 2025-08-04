package in.strings;



public class MajorityElement {
    public static int majorityElement(int[] arr){
        int count=0;
        int candy=0;
        for (int i:arr){
            if(count==0){
                candy=i;
            }
            if(candy==i){
                count++;
            }else {
                count--;
            }
        }
        return candy;
    }
    public static void main(String[] args) {
        int[] num={2,2,1,1,1,2,1};
        System.out.println(majorityElement(num));
    }
}
