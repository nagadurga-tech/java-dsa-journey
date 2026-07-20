/*
------------------------------------------------------------
Problem: 4Sum
Platform: LeetCode
Difficulty: Medium

Approach:
1. Sort the array in ascending order.
2. Fix the first element using index 'i'.
3. Fix the second element using index 'j'.
4. Use two pointers:
   - Left pointer (l = j + 1)
   - Right pointer (r = n - 1)
5. Calculate the sum of the four elements.
6. If:
   - Sum == target → Store the quadruplet and skip duplicates.
   - Sum < target  → Move the left pointer.
   - Sum > target  → Move the right pointer.
7. Skip duplicate values for 'i', 'j', 'l', and 'r'
   to avoid duplicate quadruplets.

Time Complexity : O(n³)
Space Complexity: O(1)
(Excluding the space used to store the result)

Concepts Used:
- Sorting
- Two Pointers
- Duplicate Handling
- Array Traversal

------------------------------------------------------------
*/

import java.util.*;
public class FourSum{
    public static void main(String args[]){
        int[] nums={1,0,-1,0,-2,2};
        int target=0;
        Arrays.sort(nums);
        int n=nums.length;
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<n-3;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<n-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                int l=j+1;
                int r=n-1;
                while(l<r){
                    long sum=(long)nums[i]+nums[j]+nums[l]+nums[r];
                    if(sum==target){
                        result.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
                        l++;
                        r--;
                        while(l<r && nums[l]==nums[l+1]) l++;
                        while(l<r && nums[r]==nums[r-1]) r--;
                    }else if(sum<target){
                        l++;
                    }else{
                        r--;
                    }
                }
            }
        }
        System.out.println(result);

    }
}