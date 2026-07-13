/*
------------------------------------------------------------
Problem: Container With Most Water
Platform: LeetCode
Difficulty: Medium

Approach:
1. Initialize two pointers:
   - Left pointer at the beginning of the array.
   - Right pointer at the end of the array.
2. Calculate the width between the two pointers.
3. Find the minimum height of the two lines.
4. Compute the area:
      Area = Width × Minimum Height
5. Update the maximum area found so far.
6. Move the pointer with the smaller height inward,
   as it may lead to a larger area.
7. Repeat until both pointers meet.

Time Complexity : O(n)
Space Complexity: O(1)

Concepts Used:
- Two Pointers
- Greedy Approach


------------------------------------------------------------
*/

public class ContainerWithMostWater {
    public static void main(String args[]){
        int[] nums={1,8,6,2,5,4,8,3,7};
        int left=0;
        int right=nums.length-1;
        int ans=0;
        while(left<right){
            int water=right-left;
            int height=Math.min(nums[left],nums[right]);
            int area=water*height;
            ans=Math.max(ans,area);
            if(nums[left]<nums[right]){
                left++;
            }else{
                right--;
            }
        }
        System.out.println(ans);
    }

}
