package in.reverse;

public class BuyAndSellStock2 {
    public static int buyAndSellStock2(int[] prices){
        int max_profit=0;

        for (int i=0; i<prices.length-1;i++){
            if(prices[i]<prices[i+1]){
                max_profit+=prices[i+1]-prices[i];
            }
        }
        return max_profit;

    }
    public static void main(String[] args) {
//            int[] prices={7,1,5,3,6,4};
            int[] prices={7,6,4,3,1};
        System.out.println(buyAndSellStock2(prices));
    }
}
