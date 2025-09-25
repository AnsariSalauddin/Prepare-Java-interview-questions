package in.sort;

public class DisBtTwWord {
    public static void main(String[] args) {
        String[] sentence={ "the", "quick", "brown", "fox", "quick" };
        String firstWord="the";
        String secondWord="fox";
        int d1=-1;
        int d2=-1;
        int res=Integer.MAX_VALUE;
        for(int i=0; i<sentence.length; i++){
            if (sentence[i]==firstWord)
                d1=i;
            if (sentence[i]==secondWord)
                d2=i;
            if (d1!=-1 && d2!=-1)
                res=Math.min(res, Math.abs(d1-d2));


        }
        System.out.println(res);
    }
}
