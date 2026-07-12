/*
------------------------------------------------------------
Problem: Remove Duplicates from Sorted Array
Platform: LeetCode
Difficulty: Easy

Approach:
1. Use two pointers (k and i).
2. Pointer 'k' keeps track of the position of the last unique element.
3. Traverse the array using pointer 'i'.
4. Whenever a new unique element is found, increment 'k'
   and place the unique element at index 'k'.
5. After traversal, the first (k + 1) elements contain
   all unique values.

Time Complexity : O(n)
Space Complexity: O(1)

Concepts Used:
- Two Pointers
- In-place Array Modification

------------------------------------------------------------
*/


public class RemoveDuplicates{
    public static void main(String args[]){
        int[] nums={1,1,2};
        int n=nums.length;
        int k=0;
        for(int i=0;i<n;i++){
            if(nums[k]!=nums[i]){
                k++;
                nums[k]=nums[i];
            }
        }
        System.out.println("Unique Elements:"+(k+1));
    }
}