/*
------------------------------------------------------------
Problem: Squares of a Sorted Array
Platform: LeetCode
Difficulty: Easy

Approach:
1. Traverse the array and square each element.
2. Sort the squared array in non-decreasing order.
3. Print the sorted squared values.

Time Complexity : O(n log n)
Space Complexity: O(1) (Ignoring sorting implementation)

------------------------------------------------------------
*/


import java.util.*;
public class SquaresOfSortedArray {
    public static void main(String args[]){
        int[] nums={-4,-1,0,3,10};
        for(int i=0;i<nums.length;i++){
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print("Squares of sorted Array: "+nums[i]+" ");
        }
    }
}
