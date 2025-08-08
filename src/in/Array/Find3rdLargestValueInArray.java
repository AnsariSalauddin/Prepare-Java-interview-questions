package in.Array;



public class  Find3rdLargestValueInArray {
    public static void find3rdLargestValueInArray(int[] arr){
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;
      for (int i=0; i<arr.length; i++){
          if (arr[i]>first){
              third=second;
              second=first;
              first=arr[i];
          }else if(arr[i]>second){
              third=second;
              second=arr[i];
          }else {
              third=arr[i];
          }
      }
        System.out.println(third);
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        find3rdLargestValueInArray(arr);

    }
}

