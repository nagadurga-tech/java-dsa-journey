/*
------------------------------------------------------------
Problem: Reverse Words in a String
Platform: LeetCode
Difficulty: Medium

Approach:
1. Remove leading and trailing spaces using trim().
2. Split the string into words using one or more spaces.
3. Traverse the words array in reverse order.
4. Append each word to a StringBuilder.
5. Add a single space between words.
6. Return the reversed string.

Time Complexity : O(n)
Space Complexity: O(n)

------------------------------------------------------------
*/ 

 class ReverseWordString{
    public static String reverseWords(String s) {

        StringBuilder str=new StringBuilder();
        String[] words=s.trim().split("\\s+");

        for(int i=words.length-1;i>=0;i--){
            str.append(words[i]);
            if(i>0){
                str.append(" ");
            }
        }
        return str.toString();
    }
    public static void main(String args[]){
        String s="the sky is blue";
        System.out.println(reverseWords(s));
    }
 }