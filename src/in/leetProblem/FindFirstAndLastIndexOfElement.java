package in.leetProblem;

public class FindFirstAndLastIndexOfElement {
    public static int[] findFirstAndLastIndexOfElement(int[] nums, int target){
        int[] res=new int[2];
        res[0]=res[1]=-1;
        for (int i=0; i<nums.length;i++){
            if(nums[i]==target){
                res[0]=i;
                while (i<nums.length-1 && nums[i+1]==target){
                    i++;
                    res[1]=i;
                }
//                 if(i<nums.length-1 && nums[i+1]!=target){
//                    res[1]=i;
//                    break;
//                }
//                if(i==nums.length-1){
//                    res[1]=i;
//
//                }

            }
        }
        return res;
    }
    public static void main(String[] args) {
       int[] nums ={5,7,7,8,8,10};//{10,10,10};//5,7,7,8,8,10

        int target = 10;
        int[] firstAndLastIndexOfElement = findFirstAndLastIndexOfElement(nums, target);
        System.out.println(firstAndLastIndexOfElement[0]+" "+firstAndLastIndexOfElement[1]);

    }
}
