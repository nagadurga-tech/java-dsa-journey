public class ValidPalindrome{
    public static boolean isPalindrome(String s){
        int n=s.length();
        StringBuilder temp = new StringBuilder();
        for(int i=0;i<n;i++){
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