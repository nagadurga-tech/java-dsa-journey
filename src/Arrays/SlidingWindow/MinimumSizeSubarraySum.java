/*
------------------------------------------------------------
Problem: Minimum Size Subarray Sum
Platform: LeetCode
Difficulty: Medium

Approach:
1. Use a sliding window with two pointers (left and right).
2. Expand the window by moving the right pointer and
   continuously add elements to the current sum.
3. When the current sum becomes greater than or equal
   to the target:
   - Update the minimum window length.
   - Shrink the window from the left by removing
     elements until the sum becomes less than the target.
4. Repeat until all elements are processed.
5. If no valid subarray exists, return 0;
   otherwise, return the minimum length found.

Time Complexity : O(n)
Space Complexity: O(1)

Concepts Used:
- Sliding Window
- Two Pointers
- Array Traversal

------------------------------------------------------------
*/
public class MinimumSizeSubarraySum {
    public static int minSubArrayLen(int target, int[] nums){
        int l=0;
        int mins=Integer.MAX_VALUE;
        int sum=0;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            while(sum>=target){
                mins=Math.min(mins,r-l+1);
                sum-=nums[l];
                l++;
            }
        }
        if(mins==Integer.MAX_VALUE){
            return 0;
        }else{
            return mins;
        }
    } 
    public static void main(String args[]){
        int[] num={2,3,1,2,4,3};
        int target=7;
        System.out.println(minSubArrayLen(target, num));
    }
}
