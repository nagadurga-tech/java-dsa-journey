/*
Approach:
---------
1. Keep a candidate and a count.
2. If count becomes 0, choose the current element as the new candidate.
3. If the current element is the same as the candidate, increase the count.
4. Otherwise, decrease the count.
5. Since the majority element appears more than n/2 times,
it cannot be completely canceled and will remain as the final candidate.
Time Complexity: O(n)
Space Complexity: O(1)
*/



import java.util.*;
class MajorityElement {
    public static int majorityElement(int[] nums) {
       int res=0;
       int count=0;
       for(int n:nums){
            if(count==0){
                res=n;
            }
            if(n==res){
                count++;
            }else{
                count--;
            }
       }   
       return res;
    }
    public static void main(String args[]){
        int[] nums={2,2,1,1,1,2,2};
        int res=majorityElement(nums);
        System.out.println("Majority Element: "+res);
    }
    
}
