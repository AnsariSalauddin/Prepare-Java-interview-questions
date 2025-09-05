package in.leetProblem;

public class SingleValue {
    public static  int singleValue(int[] n){
        int value=0;
        for (int i=0; i<n.length; i++){
            value^=n[i];
            System.out.println(value);
        }

        return value;
    }
    public static void main(String[] args) {
    int[] arr={4,1,2,1,2};
        int i = singleValue(arr);
        System.out.println("unique value"+i);
    }
}
