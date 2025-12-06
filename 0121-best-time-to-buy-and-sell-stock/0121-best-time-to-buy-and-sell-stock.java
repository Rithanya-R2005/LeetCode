class Solution {
    public int maxProfit(int[] prices) {
        int min_price=Integer.MAX_VALUE;
        int max_profit=0;
        for(int val: prices){
            min_price=Math.min(min_price,val);
            max_profit=Math.max(max_profit,val-min_price);
        }
        return max_profit;
    }
}