package in.Array;


import java.util.PriorityQueue;

public class KthSmallestUsingPriorityQueue {
    public static int smallestKth(int[] nums, int k){
        PriorityQueue<Integer> p=new PriorityQueue<>((a,b)->b-a);
        for (int num:nums){
            p.offer(num);
            if (p.size()>k){
                p.poll();
            }
        }
        return p.peek();
    }
    public static void main(String[] args) {

//        int[] nums={7,10,4,3,20,15}; 20,15,10,7,4,3  // 3,4,7,10,15,20
        int[] nums={3,2,1,5,6,4};
        int k=2;
        int i = smallestKth(nums, 2);
        System.out.println(i);

    }
}
