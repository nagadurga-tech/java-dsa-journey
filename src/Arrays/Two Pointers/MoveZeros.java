/*
------------------------------------------------------------
Problem: Move Zeroes
Platform: LeetCode
Difficulty: Easy

Approach:
1. Use a pointer (j) to track the position of the next non-zero element.
2. Traverse the array using another pointer (i).
3. Whenever a non-zero element is found, place it at index j and increment j.
4. After moving all non-zero elements, fill the remaining positions with zeroes.

Time Complexity : O(n)
Space Complexity: O(1)

Key Concept:
- Two Pointer Technique
- In-place Array Modification

------------------------------------------------------------
*/


import java.util.*;
public class MoveZeros{
    public static void main(String args[]){
        int nums[]={0,1,0,3,12};
        int n=nums.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }
        while(j<n){
            nums[j]=0;
            j++;
        }
        System.out.print(Arrays.toString(nums));
    }
}