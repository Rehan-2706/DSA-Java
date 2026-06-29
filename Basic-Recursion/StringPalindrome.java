import java.util.*;
public class StringPalindrome {
    static boolean check(String s,int start,int end)
    {
        while(start<end)
        {
            if(s.charAt(start)!=s.charAt(end))
                return false;

            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.next();
        int start=0;
        int end=s.length()-1;
        boolean b= check(s,start,end);
        if(b)
        {
            System.out.println("String is plaindrome");
        }
        else
        {
            System.out.println("String is not plaindrome");
        }
    }
}
