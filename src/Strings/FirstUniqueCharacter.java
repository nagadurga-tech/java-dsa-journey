/*
------------------------------------------------------------
Problem: First Unique Character in a String
Platform: LeetCode
Difficulty: Easy

Approach:
1. Use a HashMap to store the frequency of each character.
2. Traverse the string once and update the frequency count.
3. Traverse the string again from left to right.
4. Return the index of the first character whose
   frequency is 1.
5. If no unique character exists, return -1.

Time Complexity : O(n)
Space Complexity: O(n)

Concepts Used:
- HashMap
- Frequency Counting
- String Traversal

------------------------------------------------------------
*/
import java.util.HashMap;
class FirstUniqueCharacter{

     public int firstUniqChar(String s){

        HashMap<Character, Integer> hm=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<s.length();i++){
            if(hm.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
     }

    public static void main(String args[]){
        FirstUniqueCharacter fuc=new FirstUniqueCharacter();
        String s="leetcode";
        System.out.println(fuc.firstUniqChar(s));
    }
}