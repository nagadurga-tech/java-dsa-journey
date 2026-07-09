
/*
------------------------------------------------------------
Problem: Next Permutation
Platform: LeetCode
Difficulty: Medium

Approach:
1. Find the pivot (first index from the right where arr[i] < arr[i+1]).
2. Find the next greater element from the right.
3. Swap the pivot with the next greater element.
4. Reverse the elements after the pivot to get the next lexicographical permutation.

Time Complexity: O(n)
Space Complexity: O(1)

------------------------------------------------------------
*/




import java.util.*;
public class NextPermutation{
    public static void main(String args[]){
        int[] arr={1,2,3};
        int p=-1;
        int n=arr.length;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                p=i;
                break;
            }
        }
        if(p!=-1){
            for(int i=n-1;i>0;i--){
                if(arr[p]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[p];
                    arr[p]=temp;
                    break;
                }
            }
        }
        int l=p+1;
        int r=n-1;
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        System.out.println(Arrays.toString(arr));
    }
}