import java.util.*;
public class LeetCode7 {
    static int reverse(int n)
    {
        int reverse=0;
        while(n!=0)
        {
            int rem=n%10;
            if(reverse>Integer.MAX_VALUE/10 || (reverse==Integer.MAX_VALUE/10 && rem>7))
            {
                return 0;

            }
            if(reverse<Integer.MIN_VALUE/10 || (reverse==Integer.MIN_VALUE/10 && rem<-8))
            {
                return 0;
                
            }
            reverse=reverse*10+rem;
            n=n/10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of which you want to calculate the reverse : ");
        int n=s.nextInt();
        int rev=reverse(n);

        System.out.println("Reverse of the given number is : "+rev);
    }
}
