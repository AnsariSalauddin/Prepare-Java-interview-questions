package in.leetCode2;


public class ConsecutiveOne {
    public static int consecutiveOnes(int[] num){
        if(num==null){
            return -1;
        }
        int count=0;
        int max=0;
        for (int i:num){
            System.out.print(i+" ");
            if(i==1){
                count++;
               max=Math.max(count,max);
            }else {
                count=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] num={1,0,1,1,0,1};//{1,1,0,1,1,1};
        int i = consecutiveOnes(num);
        System.out.println();
        System.out.println(i);
    }
}

