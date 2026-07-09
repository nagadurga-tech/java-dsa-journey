
/*
------------------------------------------------------------
Problem: Find All Numbers Disappeared in an Array
Platform: LeetCode
Difficulty: Easy

Approach:
1. Store all array elements in a HashSet.
2. Traverse numbers from 1 to n.
3. Check whether each number exists in the HashSet.
4. If a number is not present, add it to the result list.
5. Print the list of missing numbers.

Time Complexity : O(n)
Space Complexity: O(n)

------------------------------------------------------------
*/


import java.util.*;
public class FindAllNumberDisappearedInArray{
    public static void main(String args[]){
        int[] arr={4,3,2,7,8,2,3,1};
        int n=arr.length;
        HashSet <Integer> set=new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        List <Integer> l=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(!(set.contains(i))){
                l.add(i);
            }
        }
        System.out.println("Disappeared Numbers: " + l);
    }
}