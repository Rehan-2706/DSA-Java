import java.util.*;
public class CheckPrime {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number to check whether it is prime or not ");
        int num=s.nextInt();
        if(num<=1)
        {
            System.out.println("0 is neither prime nor composite ");
            return;
        }
        int flag=0;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("Entered number is prime");
        }
        else{
            System.out.println("Entered number is not prime");
        }
    }
}
