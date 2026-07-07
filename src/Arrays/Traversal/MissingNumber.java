/*
------------------------------------------------------------
Problem: Missing Number
Platform: LeetCode
Difficulty: Easy

Approach:
1. Calculate the expected sum of numbers from 0 to n.
2. Calculate the actual sum of the given array.
3. The difference between the expected sum and actual sum is the missing number.

Time Complexity : O(n)
Space Complexity: O(1)

------------------------------------------------------------
*/


public class MissingNumber {
    public static void main(String args[]){
        int arr[]={3,0,1};
        int n=arr.length;
        int res=0;
        int exp=n*(n+1)/2;
        for(int i : arr){
            res+=i;
        }
       System.out.println("Missing Number:"+(exp-res));
    }
}
