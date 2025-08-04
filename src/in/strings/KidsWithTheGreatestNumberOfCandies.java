package in.strings;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public static List<Boolean>  kidsWithTheGreatestNumberOfCandies(int[] candy,int extraCondy){
        int maxCandy=0;
        for (int  i:candy){
           maxCandy= Math.max(maxCandy, i);
        }
        List<Boolean> res=new ArrayList<>();
        for (int i:candy){
            if(i+extraCondy>=maxCandy){
                res.add(true);
            }else {
                res.add(false);
            }
        }
        return  res;
    }
    public static void main(String[] args) {
        int[] candy={2,3,5,1,3};
        int extraCandy=3;
        List<Boolean> booleans = kidsWithTheGreatestNumberOfCandies(candy, extraCandy);
        System.out.println(booleans);

    }
}

