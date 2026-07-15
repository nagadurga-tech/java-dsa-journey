/*
------------------------------------------------------------
Problem: 3Sum
Platform: LeetCode
Difficulty: Medium

Approach:
1. Sort the array in ascending order.
2. Fix one element at a time.
3. Use two pointers (left and right) to find
   two numbers whose sum with the fixed element is zero.
4. If the sum is:
   - Less than 0 → Move the left pointer.
   - Greater than 0 → Move the right pointer.
   - Equal to 0 → Store the triplet in a HashSet
     to avoid duplicate results.
5. Convert the HashSet into a List and print the result.

Time Complexity : O(n²)
Space Complexity: O(n)

Concepts Used:
- Sorting
- Two Pointers
- HashSet
- Array Traversal
------------------------------------------------------------
*/



import java.util.*;
public class ThreeSum{
    public static void main(String args[]){
        int[] arr={-1,0,1,2,-1,-4};
        Arrays.sort(arr);
        int n=arr.length;
        Set<List <Integer>> hs=new HashSet<>();
        for(int i=0;i<n;i++){
            int l=i+1;
            int r=n-1;
            while(l<r){
                int sum=arr[i]+arr[l]+arr[r];
                if(sum<0){
                    l++;
                }else if(sum>0){
                    r--;
                }else{
                    List <Integer> temp=new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[l]);
                    temp.add(arr[r]);
                    hs.add(temp);
                    l++;
                    r--;
                }
            }
        }
        List<List <Integer>>list=new ArrayList<>(hs);
        System.out.print(list);

    }
}