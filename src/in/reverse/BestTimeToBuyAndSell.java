package in.reverse;



public class BestTimeToBuyAndSell {
    public static int maxProfit(int[] prices){
        int len=prices.length;
        int max_profit=0;
        int buy_price=prices[0];
        for (int i=1; i<len; i++){
            int cur_profit=prices[i]-buy_price;
            if(cur_profit>max_profit){
                max_profit=cur_profit;
            }
            if(prices[i]<buy_price){
                buy_price=prices[i];
            }
        }
        return max_profit;
    }
    public static void main(String[] args) {

//        int[] prices={7,1,5,3,6,4};
        int[] prices={7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }
}
