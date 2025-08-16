package in.leetCode2;


public class ReverseImage {
    public static void reverseImage(int[][] num){
        for (int i=0; i<num.length; i++){
            for (int j=i+1; j< num[0].length;j++){
                int temp=num[i][j];
                num[i][j]=num[j][i];
                num[j][i]=temp;
            }
        }
       for (int i=0; i<num.length; i++){
          int start=0;
          int end=num.length-1;
          while (start<end){
              int temp=num[i][start];
              num[i][start]=num[i][end];
              num[i][end]=temp;
              start++;
              end--;
          }
       }
    }

    public  static void main(String[] args) {
        int[][] num={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        reverseImage(num);
        for (int i=0; i<num.length; i++){
            for (int j=0; j<num[0].length; j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }

    }
}

