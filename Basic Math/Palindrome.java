import java.util.*;
public class Palindrome
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number to check whether it is palindrome or not ");
        int num=s.nextInt();
        int original=num;
        int reverse=0;
        while (num>0) {
            int rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;
        }
        if(original==reverse)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }
}