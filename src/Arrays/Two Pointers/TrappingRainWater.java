/*
------------------------------------------------------------
Problem: Trapping Rain Water
Platform: LeetCode
Difficulty: Hard

Approach:
1. Initialize two pointers:
   - Left pointer at the beginning of the array.
   - Right pointer at the end of the array.
2. Maintain two variables:
   - leftMax stores the maximum height seen from the left.
   - rightMax stores the maximum height seen from the right.
3. Compare the heights at both pointers.
4. If the left height is smaller:
   - Update leftMax if needed.
   - Otherwise, trapped water is:
         leftMax - height[left]
   - Move the left pointer.
5. Otherwise:
   - Update rightMax if needed.
   - Otherwise, trapped water is:
         rightMax - height[right]
   - Move the right pointer.
6. Continue until both pointers meet.
7. Return the total trapped water.

Time Complexity : O(n)
Space Complexity: O(1)

Concepts Used:
- Two Pointers
- Greedy Approach
- Array Traversal

------------------------------------------------------------
*/

public class TrappingRainWater {
    public static int trap(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int water = 0;

        while (left < right) {

            if (height[left] < height[right]) {

                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    water += leftMax - height[left];
                }
                left++;

            } else {

                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    water += rightMax - height[right];
                }
                right--;
            }
        }
        return water;
    }

    public static void main(String[] args) {
        int[] height = {4,2,0,3,2,5};
        System.out.println(trap(height));
    }
}