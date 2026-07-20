/*
------------------------------------------------------------
Problem: Squares of a Sorted Array
Platform: LeetCode
Difficulty: Easy

Approach:
1. Create a result array of the same size.
2. Initialize two pointers:
   - Left pointer at the beginning.
   - Right pointer at the end.
3. Compare the square of both elements.
4. Place the larger square at the end of the result array.
5. Move the corresponding pointer inward.
6. Repeat until the left pointer crosses the right pointer.
7. Return the sorted squared array.

Time Complexity : O(n)
Space Complexity: O(n)

Concepts Used:
- Two Pointers
- Array Traversal

------------------------------------------------------------
*/


import java.util.*;
public class SquaresOfSortedArray {
    public static int[] sortedSquares(int[] nums){
        int res[]=new int[nums.length];
        int l=0;
        int r=nums.length-1;
        int idx=nums.length-1;
        while(l<=r){
            int sl=nums[l]*nums[l];
            int sr=nums[r]*nums[r];
            if(sl>sr){
               res[idx--]=sl; 
               l++;
            }else{
                res[idx--]=sr;
                r--;
            }
        }
        return res;
    }
    public static void main(String args[]){
        int[] nums={-4,-1,0,3,10};
        int[] result=sortedSquares(nums);
        System.out.print(Arrays.toString(result));
    }
}
