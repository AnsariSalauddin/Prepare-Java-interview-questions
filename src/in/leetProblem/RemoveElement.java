package in.leetProblem;


public class RemoveElement {
    public static void removeElement(int[] arr,int val){
        int count=0;
        for (int i=0; i<arr.length; i++){
            if(arr[i]!=val){
                arr[count]=arr[i];
                count++;
            }
        }
        while (count<arr.length){
            arr[count]=0;
            count++;
        }
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={3,2,2,3};
        removeElement(arr,3);

    }
}

