/*
------------------------------------------------------------
Problem: Best Time to Buy and Sell Stock
Platform: LeetCode
Difficulty: Easy

Approach:
1. Initialize the minimum price as a very large value.
2. Traverse the array from left to right.
3. For each day's price:
   - Update the minimum buying price if the current price is lower.
   - Calculate the profit by selling on the current day.
   - Update the maximum profit if the current profit is greater.
4. Continue until the end of the array.
5. Return the maximum profit.

Time Complexity : O(n)
Space Complexity: O(1)

------------------------------------------------------------
*/

public class BestTimeToBuyAndSellStock{
    public static int maxProfit(int[] prices){
        int minp=Integer.MAX_VALUE;
        int maxp=0;
        for(int p:prices){
            minp=Math.min(minp,p);
            int profit=p-minp;
            maxp=Math.max(profit,maxp);
        }
        return maxp;

    } 
    public static void main(String args[]){
        int[] prices={7,1,5,3,6,4}; 
        System.out.println(maxProfit(prices));
    }
}