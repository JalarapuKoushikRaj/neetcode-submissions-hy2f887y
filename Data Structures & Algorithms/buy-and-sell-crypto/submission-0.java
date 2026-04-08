class Solution {
    public int maxProfit(int[] prices) {
        int min = 0;
        for(int i=0;i<prices.length;i++)
        {
           for(int j=i+1;j<prices.length;j++)
           {
            min= Math.max(min,prices[j]-prices[i]);
           }
        }
        return min;
    }
}
