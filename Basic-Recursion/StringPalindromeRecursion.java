import java.util.*;
public class StringPalindromeRecursion {
    static boolean check(String st,int start,int n)
    {
        if(start>=n/2)
            return true;
        if(st.charAt(start)!=st.charAt(n-start-1))
            return false;
            return check(st, start+1, n);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string");
        String st=s.next();
        int start=0;
        int n=st.length();
        boolean isplaindrome=check(st,start,n);
        if(isplaindrome)
            System.out.println("String is palindrome");
        else
        {
            System.out.println("String is not plaindrome");
        }
    }
}
