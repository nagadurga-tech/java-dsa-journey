/*
Approach:
---------
1. Sort the array.
2. Since the majority element appears more than n/2 times,
   it will always be present at the middle index after sorting.
3. Return nums[n/2].

Time Complexity : O(n log n)
Space Complexity: O(1)

Key Concept:
Sorting guarantees that the majority element occupies the middle position.
*/



import java.util.*;
class MajorityElement {
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length/2;
        return nums[n];   
    }
    public static void main(String args[]){
        int[] nums={2,2,1,1,1,2,2};
        int res=majorityElement(nums);
        System.out.println("Majority Element: "+res);
    }
    
}
