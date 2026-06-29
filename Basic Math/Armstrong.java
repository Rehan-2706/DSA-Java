import java.util.*;
public class Armstrong
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number to check whether it is armstrong or not ");
        int num=s.nextInt();
        int copy=num;
        int count=0;
        while (num>0) {
            count++;
            num=num/10;
        }
        num=copy;
        int armstrong=0;
        while (num>0) {
            int rem=num%10;
            armstrong= armstrong+(int) Math.pow(rem, count);
            num=num/10;
        }
        if(armstrong==copy)
        {
            System.out.println("Number is armstrong");
        }
        else
        {
            System.out.println("Number is not armstrong");
        }
    }
}