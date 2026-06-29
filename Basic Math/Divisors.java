import java.util.*;
public class Divisors {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number to print its Divisors ");
        int num=s.nextInt();
        if(num==0)
        {
            System.out.println("NO DIVISORS EXIST ");
            return;
        }
        System.out.println("Divisors of entered number are : ");
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                     System.out.println(i);
            }
        }
    }
}
