class Solution {
    public int maxProfit(int[] prices) {
       int mini=prices[0];
       int maxp=0;
       for(int i=0;i<prices.length;i++)
       {
        int profit=prices[i]-mini;
        maxp=Math.max(maxp,profit);
        mini=Math.min(prices[i],mini);
       }
       return maxp;
    }
}