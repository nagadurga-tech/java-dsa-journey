/*
------------------------------------------------------------
Problem: Valid Palindrome
Platform: LeetCode
Difficulty: Easy

Approach:
1. Traverse the input string.
2. Keep only alphanumeric characters and convert
   all letters to lowercase.
3. Store the processed characters in a new string.
4. Use two pointers:
   - Left pointer starts from the beginning.
   - Right pointer starts from the end.
5. Compare characters at both pointers.
   - If they are different, return false.
   - Otherwise, move both pointers inward.
6. If all characters match, return true.

Time Complexity : O(n)
Space Complexity: O(n)

Concepts Used:
- StringBuilder
- Character Methods
- Two Pointers
- String Manipulation

------------------------------------------------------------
*/


public class ValidPalindrome{
    public static boolean isPalindrome(String s){
        StringBuilder temp = new StringBuilder();
        for(int i=0;i<s.length;i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                temp.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        String str=temp.toString();
        int l=0;
        int r=str.length()-1;
        while(l<r){
            if(str.charAt(l)!=str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void main(String args[]){
        String s="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));

    }
}