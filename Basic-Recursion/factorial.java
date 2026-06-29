import java.util.*;
public class factorial {
    static int fact(int n)
    {
        if(n==0)
            return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=s.nextInt();
        System.out.println("Factorial of given number is "+fact(n));
    }
}
