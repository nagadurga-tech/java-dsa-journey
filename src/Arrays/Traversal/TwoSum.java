/*
------------------------------------------------------------
Problem: Two Sum
Platform: LeetCode
Difficulty: Easy

Approach:
1. Use a HashMap to store each element and its index.
2. For every element, calculate the required complement (target - current element).
3. If the complement exists in the HashMap, return both indices.
4. Otherwise, store the current element and its index.

Time Complexity : O(n)
Space Complexity: O(n)

------------------------------------------------------------
*/



import java.util.HashMap;
public class TwoSum {
    public static int[] twoSum(int nums[], int target){
        int n=nums.length;
        HashMap <Integer,Integer> hm= new HashMap<>();
        for(int i=0;i<n;i++){
            int res=target-nums[i];
            if((hm.containsKey(res))){
                return new int[]{hm.get(res),i};
            }
            hm.put(nums[i],i);
        } 
        return new int[]{-1, -1};
    }
    public static void main(String args[]){
        int nums[]={2,7,11,15};
        int target=9;
        int res[]=twoSum(nums,target);
        System.out.println("Two Sum Indices: "+res[0]+" "+res[1]);
    }
}
