import java.util.*;
public class StringPalindrome
{
    static boolean isPalindrome(String str)
    {
        int left=0;
        int right=str.length()-1;
        while(left<=right)
        {
            if(str.charAt(left)!=str.charAt(right))
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
        System.out.println("Enter a string");
        String str=s.next();
        boolean ispal=isPalindrome(str);
        if(ispal)
        {
            System.out.println("String is palindrome");
        }
        else
        {
            System.out.println("String is not palindrome");
        }
    }
}