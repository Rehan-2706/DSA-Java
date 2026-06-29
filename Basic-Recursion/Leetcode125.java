import java.util.*;
class Leetcode125 {
    static boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right)
        {
            while(left<right && !Character.isLetterOrDigit(s.charAt(left)))
            {
                left++;
            }
             while(left<right && !Character.isLetterOrDigit(s.charAt(right)))
            {
                right--;
            }
            if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right)))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=s.next();
        boolean ispal=isPalindrome(str);
        if(ispal)
        {
            System.out.println("String is a palindrome");
        }
        else
        {
            System.out.println("String is not palindrome");
        }
    }
}