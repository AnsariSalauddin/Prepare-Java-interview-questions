package in.Array;



public class PrintSpiral {
    public static void printSpiral(int[][] arr) {
        int startRow = 0;
        int endRow = arr.length - 1;
        int startCol = 0;
        int endCol = arr[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(arr[startRow][i] + " ");
            }
           for (int i = startRow+1; i <= endRow; i++) {
                System.out.print(arr[i][endCol] + " ");
            }
           for (int i = endCol-1; i >= startCol; i--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(arr[endRow][i] + " ");
            }
            for (int i = endRow-1; i >= startRow+1; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(arr[i][startCol] + " ");
            }
            startCol++;
            startRow++;
            endRow--;
            endCol--;

        }

    }

    public static void main(String[] args) {
        int[][] arr={
                {1,2,3,4},
                {2,3,4,5},
                {3,4,5,6}
        };
        printSpiral(arr);

    }
}

