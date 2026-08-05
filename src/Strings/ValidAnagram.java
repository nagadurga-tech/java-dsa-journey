/*
------------------------------------------------------------
Problem: Valid Anagram
Platform: LeetCode
Difficulty: Easy

Approach:
1. Convert both strings into character arrays.
2. If the lengths are different, return false.
3. Sort both character arrays.
4. Compare the sorted arrays using Arrays.equals().
5. If both arrays are identical, return true;
   otherwise, return false.

Time Complexity : O(n log n)
Space Complexity: O(n)

Concepts Used:
- Strings
- Character Arrays
- Sorting

------------------------------------------------------------
*/



import java.util.*;
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
       char[] s1=s.toCharArray();
       char[] s2=t.toCharArray();
       if(s1.length!=s2.length){
        return false;
       }
       Arrays.sort(s1);
       Arrays.sort(s2);

       return Arrays.equals(s1,s2);

    }
    public static void main(String args[]){
        String s="anagram";
        String t="nagaram";
        ValidAnagram va = new ValidAnagram();
        System.out.println(va.isAnagram(s,t));
    }
}
