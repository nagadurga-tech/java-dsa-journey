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

       if(Arrays.equals(s1,s2)){
            return true;
       }else{
        return false;
       }

    }
    public static void main(String args[]){
        String s="anagram";
        String t="nagaram";
        ValidAnagram va = new ValidAnagram();
        System.out.println(va.isAnagram(s,t));
    }
}
