/*
------------------------------------------------------------
Problem: Maximum Number of Vowels in a Substring of Given Length
Platform: LeetCode
Difficulty: Medium

Approach:
1. Use a fixed-size sliding window of size k.
2. Traverse the string using a right pointer.
3. If the current character is a vowel, increment the vowel count.
4. When the window size becomes greater than k:
   - Check the character at the left pointer.
   - If it is a vowel, decrement the vowel count.
   - Move the left pointer forward.
5. When the window size becomes exactly k, update the
   maximum number of vowels found so far.
6. Return the maximum vowel count.

Time Complexity : O(n)
Space Complexity: O(1)

Concepts Used:
- Fixed-Size Sliding Window
- Two Pointers
- String Traversal

------------------------------------------------------------
*/


class MaxVowelsInSubstring{

    public static int maxVowels(String s, int k){
        int l=0;
        int maxVowels=0;
        int count=0;

        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }

            if(r-l+1 > k){
                char c=s.charAt(l);
                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                    count--;
                }
                l++;
            }
            if(r-l+1 == k){
                maxVowels=Math.max(maxVowels,count);
            }
        }
        return maxVowels;
    }

    public static void main(String args[]){
        String s="abciiidef";
        int k=3;
        MaxVowelsInSubstring obj=new MaxVowelsInSubstring();
        System.out.println(obj.maxVowels(s, k));
    }
}