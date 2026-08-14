1class Solution {
2    public int maxProfit(int[] prices) {
3        int min =prices[0];
4        int profit =0;
5        for (int i = 0 ; i<prices.length;i++) {
6            if (prices[i]<min){
7                min = prices[i];
8            }
9              int currentprofit = prices[i] - min;
10              if (currentprofit>profit){
11            profit = currentprofit;
12        }
13
14        }  return profit;
15    }
16}
17      
18