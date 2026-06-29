import java.util.*;
public class Gcd
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two numbers of which you want GCD");
        int n1=s.nextInt();
        int n2=s.nextInt();
        n1=Math.abs(n1);
        n2=Math.abs(n2);
        if(n1==0 && n2==0)
        {
            System.out.println("Both the numbers are 0 s0 GCD is not defined ");
            return;
        }
        if(n1==0)
        {
            System.out.println("GCD : "+n2);
            return;
        }
        if(n2==0)
        {
            System.out.println("GCD : "+n1);
            return;
        }
        
        int GCD=1;
        for(int i=Math.min(n2, n1);i>=1;i--)
        {
            if(n1%i==0 && n2%i==0)
            {
                GCD=i;
                break;
            }
        }
        System.out.println("GCD of two numbers is : "+GCD);
    }
}