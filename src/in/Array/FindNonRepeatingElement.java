package in.Array;



import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindNonRepeatingElement {
    public static void findNonRepeatingElement(int[] arr){
        for (int i=0; i<arr.length;i++){
            for (int j=i+1; j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[j]=0;
                    arr[i]=0;
                }
            }
        }
        for (Integer in:arr){
            if(in!=0){
                System.out.println(in);
            }
        }

        //stream approach
//        Map<Integer, Long> collect = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
//        List<Integer> list = collect.keySet().stream().filter(x -> collect.get(x) == 1).toList();
//        list.forEach(System.out::println);

    }
    public static void main(String[] args) {
        int[] ar={1,2,3,4,1,2,5,3,4};
        findNonRepeatingElement(ar);


    }
}

