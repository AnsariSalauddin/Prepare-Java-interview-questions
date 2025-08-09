package in.strings;


public class SpiralMatrix {
    public static void printSpiral(int[][] arr){
        int startRow=0;
        int endRow=arr.length-1;
        int startCol=0;
        int endCol=arr[0].length-1;
        while (startRow<=endRow && startCol<=endCol){
            for (int i=startCol; i<=endCol; i++){
                System.out.print(arr[startRow][i]+" ");
            }
            for (int j=startRow+1; j<=endRow; j++){
                System.out.print(arr[j][endCol]+" ");
            }
            if (startRow < endRow) {
                for (int i = endCol - 1; i >= startCol; i--) {
                    System.out.print(arr[endRow][i] + " ");
                }
            }
            if (startCol < endCol) {
                for (int i = endRow - 1; i > startRow; i--) {
                    System.out.print(arr[i][startCol] + " ");
                }
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }
    public static void main(String[] args) {

        int[][] arr={
                {1,2,3},
                {2,5,6},
                {7,8,9}
        };
        printSpiral(arr);
    }
}

