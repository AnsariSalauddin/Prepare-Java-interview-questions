package Arrays;



public class MoveAllZeroLast {
    public static void moveZeroLast(int[] arr){
        int k=0;
       for (int i=0; i<arr.length; i++){
           if(arr[i]!=0){
               arr[k++]=arr[i];
           }
       }
       while (k<arr.length){
           arr[k++]=0;
       }
       for (int ii:arr){
           System.out.print(ii+" ");
       }
    }
    public static void main(String[] args) {
        int[] arr={1,0,2,1,0,3,2,0,5};
        moveZeroLast(arr);
    }
}

