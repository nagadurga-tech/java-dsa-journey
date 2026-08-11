/*
------------------------------------------------------------
Problem: Maximum Average Subarray I
Platform: LeetCode
Difficulty: Easy

Approach:
1. Calculate the sum of the first k elements to create
   the initial sliding window.
2. Store this sum as the maximum sum found so far.
3. Slide the window through the remaining elements:
   - Add the new element entering the window.
   - Remove the element leaving the window.
   - Update the maximum sum.
4. After checking all windows, divide the maximum sum
   by k to get the maximum average.
5. Cast the result to double to get the decimal value.

Time Complexity : O(n)
Space Complexity: O(1)

Concepts Used:
- Sliding Window
- Running Sum
- Array Traversal

------------------------------------------------------------
*/


class MaxAverageSubarray{
    public double findMaxAverage(int[] nums, int k){
        int n=nums.length;
        long max=0;
        for(int i=0;i<k;i++){
            max+=nums[i];
        }
        long maxSum=max;
        for(int i=k;i<n;i++){
            max+=nums[i];
            max-=nums[i-k];
            maxSum=Math.max(maxSum,max);
        }
        return(double)maxSum/k;
    }
    public static void main(String args[]){
        int[] nums={1,12,-5,-6,50,3};
        int k=4;
        MaxAverageSubarray obj=new MaxAverageSubarray();
        System.out.println(obj.findMaxAverage(nums, k));
    }
}