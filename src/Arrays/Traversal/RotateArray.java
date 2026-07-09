/*
------------------------------------------------------------
Problem: Rotate Array
Platform: LeetCode
Difficulty: Medium

Approach:
1. Calculate the effective rotation using k % n.
2. Create a temporary array.
3. Copy the last k elements of the original array to the beginning of the temporary array.
4. Copy the remaining elements to the remaining positions.
5. Copy the temporary array back to the original array.

Time Complexity : O(n)
Space Complexity: O(n)


------------------------------------------------------------
*/

public class RotateArray{
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7};
        int k=3;
        int n=arr.length;
        k=k%n;
        int temp[]=new int[n];
        for(int i=0;i<k;i++){
            temp[i]=arr[i+(n-k)];
        }

        for(int i=k;i<n;i++){
            temp[i]=arr[i-k];
        }

        for(int i=0;i<n;i++){
            arr[i]=temp[i];
            System.out.print(arr[i]+" ");
        }
    }
}