package whenToSell;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

class Solution {
    public int maxProfit(int[] prices) {

        if (prices == null || prices.length < 2){
            return 0;
        }

        int maxProfit = 0;
        int possibleProfit = 0;

        int currMin = prices[0];
        int currMax = prices[0];

        int possibleMin = prices[0];
        int possibleMax = prices[0];

        for (int i = 1; i < prices.length; i++){
            if (prices[i] > currMax){
                currMax = prices[i];
                possibleMax = prices[i];
            } else if (prices[i] > possibleMax){
                possibleMax = prices[i];
            } else if (prices[i] < currMin) {
                possibleMin = prices[i];
                possibleMax = prices[i];
            }

            maxProfit = currMax - currMin;
            possibleProfit = possibleMax - possibleMin;

            if (possibleProfit > maxProfit){
                currMin = possibleMin;
                currMax = possibleMax;
                maxProfit = possibleProfit;
            }
        }

        return maxProfit;

    }
}
